package com.pastdue.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.pastdue.model.Payment;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @RequestMapping("/payment")
    public String message() {
        return "P A Y M E N T S";
    }
    

    @RequestMapping(value = "/payments", method = RequestMethod.GET)
    public List<Payment> list() {
        return PaymentStub.list();
    }

    @RequestMapping(value = "/payments", method = RequestMethod.POST)
    public Payment create(@RequestBody Payment shipwreck) {
        return PaymentStub.create(shipwreck);
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.GET)
    public Payment get(@PathVariable String id) {
        return PaymentStub.get(id);
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.PUT)
    public Payment update(@PathVariable String id, @RequestBody Payment shipwreck) {
        return PaymentStub.update(id, shipwreck);
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.DELETE)
    public Payment delete(@PathVariable String id) {
        return PaymentStub.delete(id);
    }
    
}
