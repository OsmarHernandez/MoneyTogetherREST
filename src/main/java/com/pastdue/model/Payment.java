package com.pastdue.model;

import java.util.Date;

public class Payment {

    String id;
    String loanId;
    Double paymentAmount;
    Date payDate;

    public Payment() { }

    public Payment(String id, String loanId, Double paymentAmount, Date payDate) {
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

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
