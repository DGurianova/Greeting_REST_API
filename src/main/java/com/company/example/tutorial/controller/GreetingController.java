package com.company.example.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody

public class GreetingController {
    @RequestMapping("/greeting")
    public String getGreeting(){

        return "Hi. This is I";
    }
}
