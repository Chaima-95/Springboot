package com.example.bank_spring.Repositories;

import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Account_Repository extends JpaRepository <Bank_Account, Integer> {


}
