package com.pastdue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastdue.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {

}