package com.zedapps.phonebook.command;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author Shamah M Zoha
 * @since 21-Feb-22
 **/
public class AppUserDetails extends User {

    public AppUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
