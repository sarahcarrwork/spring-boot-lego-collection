package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//tell Spring this is a rest controller
@RestController
public class HomeController {

    //if user hits end point "/" return "Das Boot, reporting for duty!"
    @RequestMapping("/")
    public String home() {
        return "My Lego Collection!";
    }

}
