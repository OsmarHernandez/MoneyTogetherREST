package com.pastdue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastdue.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

}