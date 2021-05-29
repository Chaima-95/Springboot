package com.example.bank_spring.services;

import com.example.bank_spring.entities.Bank;
import com.example.bank_spring.entities.Bank_Account;

import java.util.Collection;
import java.util.List;

public interface BankService {
    Bank Add_Bank(Bank b);
    public List<Bank> show_Banks();
    void Delete_Bank(int id);
}
