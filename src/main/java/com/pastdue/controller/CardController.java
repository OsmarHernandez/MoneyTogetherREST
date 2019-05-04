package com.pastdue.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.pastdue.model.Card;

@RestController
@RequestMapping("/api/v1")
public class CardController {

    @RequestMapping("/card")
    public String message() {
        return "C A R D S";
    }

    @RequestMapping(value = "/cards", method = RequestMethod.GET)
    public List<Card> list() {
        return CardStub.list();
    }

    @RequestMapping(value = "/cards", method = RequestMethod.POST)
    public Card create(@RequestBody Card shipwreck) {
        return CardStub.create(shipwreck);
    }

    @RequestMapping(value = "/cards/{id}", method = RequestMethod.GET)
    public Card get(@PathVariable String id) {
        return CardStub.get(id);
    }

    @RequestMapping(value = "/cards/{id}", method = RequestMethod.PUT)
    public Card update(@PathVariable String id, @RequestBody Card shipwreck) {
        return CardStub.update(id, shipwreck);
    }

    @RequestMapping(value = "/cards/{id}", method = RequestMethod.DELETE)
    public Card delete(@PathVariable String id) {
        return CardStub.delete(id);
    }
}
