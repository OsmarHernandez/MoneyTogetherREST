package com.pastdue.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    String id;
    String concept;
    Double amount;
    Double remainToPay;
    String paymentTerm;
    String paymentPlan;
    String start;
    String lenderId;
    String lenderCard;
    String borrowerId;
    String borrowerCard;

    public Loan() { }

    public Loan(String id, String concept, Double amount, Double remainToPay, String paymentTerm, String paymentPlan,
                String start, String lenderId, String lenderCard, String borrowerId, String borrowerCard) {
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLenderId() {
        return lenderId;
    }

    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }

    public String getLenderCard() {
        return lenderCard;
    }

    public void setLenderCard(String lenderCard) {
        this.lenderCard = lenderCard;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBorrowerCard() {
        return borrowerCard;
    }

    public void setBorrowerCard(String borrowerCard) {
        this.borrowerCard = borrowerCard;
    }
}
