package com.example.bank_spring.Repositories;

import com.example.bank_spring.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bank_Repository extends JpaRepository <Bank, Integer> {
}
