package com.example.graduates.config;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Profile("jwt")
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<SimpleGrantedAuthority> roles = null;
        if (username.equals("milan")) {
            roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
            return new User("milan", "milan",
                roles);
        } else if (username.equals("antonio")) {
            roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
            return new User("antonio", "antonio",
                roles);
        }
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
}
