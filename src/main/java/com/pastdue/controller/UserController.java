package com.pastdue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pastdue.model.User;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @RequestMapping("/user")
    public String message() {
        return "U S E R S";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> list() {
        return UserStub.list();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User create(@RequestBody User shipwreck) {
        return UserStub.create(shipwreck);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable String id) {
        return UserStub.get(id);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable String id, @RequestBody User shipwreck) {
        return UserStub.update(id, shipwreck);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable String id) {
        return UserStub.delete(id);
    }
    
}
