package com.example.SecurityMyBatis.service;

import com.example.SecurityMyBatis.mapper.UserMapper;
import com.example.SecurityMyBatis.model.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AuthenticationService implements AuthenticationProvider {

    private final UserMapper userMapper;
    private final HashService hashService;

    public AuthenticationService(UserMapper userMapper, HashService hashService) {
        this.userMapper = userMapper;
        this.hashService = hashService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException
    {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        System.out.println("USERNAME: " + username);

        User user = userMapper.getUser(username);
        if(user != null)
        {
            String salt = user.getSalt();
            String hashedPassword = hashService.getHashedValue(password, salt);
            if(user.getPassword().equals(hashedPassword))
                return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
