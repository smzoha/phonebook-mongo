package com.zedapps.phonebook.controller;

import com.zedapps.phonebook.entity.User;
import com.zedapps.phonebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;

/**
 * @author Shamah M Zoha
 * @since 3/6/2022
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String getRegistrationForm(ModelMap model) {
        model.put("user", new User());

        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String processUserRegistration(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Collections.singletonList("USER"));
        userService.save(user);

        return user.toString();
    }
}
