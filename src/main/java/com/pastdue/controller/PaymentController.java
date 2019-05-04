package com.pastdue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @RequestMapping("/payment")
    public String message() {
        return "P A Y M E N T S";
    }
}
