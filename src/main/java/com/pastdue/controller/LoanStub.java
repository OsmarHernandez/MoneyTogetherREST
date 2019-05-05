package com.pastdue.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pastdue.model.Loan;

public class LoanStub {
	
    private static Map<String, Loan> loans = new HashMap<String, Loan>();
    private static String id = "A4678419-9FBE-49DF-A7E1";

    // populating fake data
    static {
        Loan a = new Loan("LoanID", "String concept", 12000.00, 10000.00, "String paymentTerm", "String paymentPlan",
                "String start", "String lenderId", "String lenderCard", "String borrowerId", "String borrowerCard");
        loans.put(a.getId(), a);
        Loan b = new Loan("BLoanID", "BString concept", 12000.00, 10000.00, "BString paymentTerm", "BString paymentPlan",
                "BString start", "BString lenderId", "BString lenderCard", "BString borrowerId", "BString borrowerCard");
        loans.put(b.getId(), b);
        Loan c = new Loan("CLoanID", "CString concept", 12000.00, 10000.00, "CString paymentTerm", "CString paymentPlan",
                "CString start", "CString lenderId", "CString lenderCard", "CString borrowerId", "CString borrowerCard");
        loans.put(c.getId(), c);
    }

    public static List<Loan> list() {
        return new ArrayList<Loan>(loans.values());
    }

    public static Loan create(Loan loan) {
    	loans.put(loan.getId(), loan);
        return loan;
    }

    public static Loan get(String id) {
        return loans.get(id);
    }

    public static Loan update(String id, Loan loan) {
    	loans.put(id, loan);
        return  loan;
    }

    public static Loan delete(String id) {
        return loans.remove(id);
    }
	
}
