package com.zedapps.phonebook.service;

import com.zedapps.phonebook.command.AppUserDetails;
import com.zedapps.phonebook.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Shamah M Zoha
 * @since 21-Feb-22
 **/
@Service
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User dbUser = userService.getUserByUsername(username);

        return new AppUserDetails(dbUser.getUsername(), dbUser.getPassword(), getAuthorities(dbUser.getRoles()));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(List<String> roles) {
        Set<GrantedAuthority> authoritySet = new HashSet<>();

        roles.forEach(role -> authoritySet.add(new SimpleGrantedAuthority(role)));

        return new ArrayDeque<>(authoritySet);
    }
}
