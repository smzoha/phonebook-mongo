package com.zedapps.phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Shamah M Zoha
 * @since 10-Mar-22
 */
@Controller
@RequestMapping("/")
public class DashboardController {

    @GetMapping
    @ResponseBody
    public String getDashboard() {
        return "Under Construction. Please check later.";
    }
}
