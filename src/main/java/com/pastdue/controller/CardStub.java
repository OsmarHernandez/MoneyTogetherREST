package com.pastdue.controller;

import java.util.*;

import com.pastdue.model.Card;


public class CardStub {

    private static Map<String, Card> cards = new HashMap<String, Card>();
    private static String id = "A4678419-9FBE-49DF-A7E0";

    // populating fake data
    static {
        Card a = new Card("49589648-D6F0-44CE-8B4C", "93523A68-584D-48EB-86BB", "5579034591230987", "2022-05", 034);
        cards.put(a.getId(), a);
        Card b = new Card("10FF7503-E8A4-4377-894C", "881B697C-709F-4B05-A394", "5279087492110788", "2021-02", 392);
        cards.put(b.getId(), b);
        Card c = new Card("CC4DAFC8-4D79-4AD1-8203", "1A45F2C3-82D7-4031-B006", "4079213409219910", "2020-01", 147);
        cards.put(c.getId(), c);
    }

    public static List<Card> list() {
        return new ArrayList<Card>(cards.values());
    }

    public static Card create(Card card) {
        cards.put(card.getId(), card);
        return card;
    }

    public static Card get(String id) {
        return cards.get(id);
    }

    public static Card update(String id, Card card) {
        cards.put(id, card);
        return  card;
    }

    public static Card delete(String id) {
        return cards.remove(id);
    }
}
