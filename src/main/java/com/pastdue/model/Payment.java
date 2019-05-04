package com.pastdue.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    String id;
    String loanId;
    Double paymentAmount;
    String payDate;

    public Payment() { }

    public Payment(String id, String loanId, Double paymentAmount, String payDate) {
        this.id = id;
        this.loanId = loanId;
        this.paymentAmount = paymentAmount;
        this.payDate = payDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }
}
