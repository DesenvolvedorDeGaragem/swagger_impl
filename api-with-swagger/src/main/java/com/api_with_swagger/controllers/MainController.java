package com.api_with_swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/welcome")
    public String helloWorld() {
        return "Welcome to my Spring Bot API";
    }
}
