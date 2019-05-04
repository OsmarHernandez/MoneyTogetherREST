package com.pastdue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App
{

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to Money Together API v1!";
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
