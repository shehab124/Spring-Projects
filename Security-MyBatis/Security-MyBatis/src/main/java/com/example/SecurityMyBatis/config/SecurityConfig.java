package com.example.SecurityMyBatis.config;

import com.example.SecurityMyBatis.service.AuthenticationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    private final AuthenticationService authenticationService;

    public SecurityConfig(AuthenticationService authenticationService)
    {
        this.authenticationService = authenticationService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
    {
        return httpSecurity.authorizeHttpRequests(registry -> {
            registry.requestMatchers("/x").permitAll();
            registry.requestMatchers("/h2-console").permitAll();
            registry.requestMatchers("/signup", "/css/**", "/js/**", "/h2-console", "/h").permitAll();
            registry.anyRequest().authenticated();
        })
                .authenticationProvider(authenticationService)
                .formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
                .formLogin(formLogin -> formLogin.defaultSuccessUrl("/chat", true))
                .build();
    }

}
