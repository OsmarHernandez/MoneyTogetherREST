package com.pastdue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public String message() {
        return "U S E R S";
    }
}
