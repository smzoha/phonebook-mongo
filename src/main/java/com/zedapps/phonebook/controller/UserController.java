package com.zedapps.phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shamah M Zoha
 * @since 10-Mar-22
 */
@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
