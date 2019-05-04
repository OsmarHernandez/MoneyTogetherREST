package com.pastdue.model;

import java.util.Date;

public class Loan {

    String id;
    String concept;
    Double amount;
    Double remainToPay;
    String paymentTerm;
    String paymentPlan;
    Date start;
    String lenderId;
    Integer lenderCard;
    String borrowerId;
    Integer borrowerCard;

    public Loan() { }

    public Loan(String id, String concept, Double amount, Double remainToPay, String paymentTerm, String paymentPlan,
                Date start, String lenderId, Integer lenderCard, String borrowerId, Integer borrowerCard) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.remainToPay = remainToPay;
        this.paymentTerm = paymentTerm;
        this.paymentPlan = paymentPlan;
        this.start = start;
        this.lenderId = lenderId;
        this.lenderCard = lenderCard;
        this.borrowerId = borrowerId;
        this.borrowerCard = borrowerCard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRemainToPay() {
        return remainToPay;
    }

    public void setRemainToPay(Double remainToPay) {
        this.remainToPay = remainToPay;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getLenderId() {
        return lenderId;
    }

    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }

    public Integer getLenderCard() {
        return lenderCard;
    }

    public void setLenderCard(Integer lenderCard) {
        this.lenderCard = lenderCard;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Integer getBorrowerCard() {
        return borrowerCard;
    }

    public void setBorrowerCard(Integer borrowerCard) {
        this.borrowerCard = borrowerCard;
    }
}
