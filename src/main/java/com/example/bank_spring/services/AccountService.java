package com.example.bank_spring.services;
import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Bank_Account> show_Account();
    Bank_Account Add_Account(Bank_Account acc);
    void Delete_Account(int id);
    void consulter (int id);



}
