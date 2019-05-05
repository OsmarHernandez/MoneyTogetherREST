package com.pastdue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pastdue.model.Loan;

@RestController
@RequestMapping("/api/v1")
public class LoanController {

    @RequestMapping("/loan")
    public String message() {
        return "L O A N S";
    }
    

    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public List<Loan> list() {
        return LoanStub.list();
    }

    @RequestMapping(value = "/loans", method = RequestMethod.POST)
    public Loan create(@RequestBody Loan shipwreck) {
        return LoanStub.create(shipwreck);
    }

    @RequestMapping(value = "/loans/{id}", method = RequestMethod.GET)
    public Loan get(@PathVariable String id) {
        return LoanStub.get(id);
    }

    @RequestMapping(value = "/loans/{id}", method = RequestMethod.PUT)
    public Loan update(@PathVariable String id, @RequestBody Loan shipwreck) {
        return LoanStub.update(id, shipwreck);
    }

    @RequestMapping(value = "/loans/{id}", method = RequestMethod.DELETE)
    public Loan delete(@PathVariable String id) {
        return LoanStub.delete(id);
    }
    
    
}
