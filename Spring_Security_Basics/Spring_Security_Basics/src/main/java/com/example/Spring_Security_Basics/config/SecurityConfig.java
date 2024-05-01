//package com.example.Spring_Security_Basics.config;
//
//import com.example.Spring_Security_Basics.service.AuthenticationService;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurer {
//
//    private AuthenticationService authenticationService;
//
//    public SecurityConfig(AuthenticationService authenticationService) {
//        this.authenticationService = authenticationService;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//    {
//        auth.authenticationProvider(this.authenticationService);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception
//    {
//        http.authorizeRequests().
//    }
//
//}
