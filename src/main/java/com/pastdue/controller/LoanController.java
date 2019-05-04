package com.pastdue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @RequestMapping("/loan")
    public String message() {
        return "L O A N S";
    }
}
