package com.pastdue.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pastdue.model.Payment;

public class PaymentStub {

    private static Map<String, Payment> payments = new HashMap<String, Payment>();
    private static String id = "A4678419-9FBE-49DF-A7E2";

    // populating fake data
    static {
    	Payment a = new Payment("String id", "String loanId", 1000.00, "String payDate");
    	payments.put(a.getId(), a);
        Payment b = new Payment("BString id", "BString loanId", 1000.00, "BString payDate");
        payments.put(b.getId(), b);
        Payment c = new Payment("CString id", "CString loanId", 1000.00, "CString payDate");
        payments.put(c.getId(), c);
    }

    public static List<Payment> list() {
        return new ArrayList<Payment>(payments.values());
    }

    public static Payment create(Payment payment) {
    	payments.put(payment.getId(), payment);
        return payment;
    }

    public static Payment get(String id) {
        return payments.get(id);
    }

    public static Payment update(String id, Payment payment) {
    	payments.put(id, payment);
        return  payment;
    }

    public static Payment delete(String id) {
        return payments.remove(id);
    }
}
