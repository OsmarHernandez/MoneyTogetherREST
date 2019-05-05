package com.pastdue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastdue.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {

}