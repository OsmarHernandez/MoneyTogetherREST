package com.pastdue.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "card")
public class Card {

    @Id
    String id;
    String ownerId;
    String number;
    String expirationDate;
    Integer securityCode;

    public Card() { }

    public Card(String id, String ownerId, String number, String expirationDate, Integer securityCode) {
        this.id = id;
        this.ownerId = ownerId;
        this.number = number;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return ownerId;
    }

    public void setOwner(String owner) {
        this.ownerId = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(Integer securityCode) {
        this.securityCode = securityCode;
    }
}
