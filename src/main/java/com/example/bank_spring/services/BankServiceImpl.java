package com.example.bank_spring.services;

import com.example.bank_spring.Repositories.Bank_Repository;
import com.example.bank_spring.entities.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{
    @Autowired
    private Bank_Repository bankrepo;
    @Override
    public List<Bank> show_Banks() {
        return bankrepo.findAll();
    }

    @Override
    public Bank Add_Bank(Bank b) {
        return this.bankrepo.save(b);
    }

    @Override
    public void Delete_Bank(int id) {
        this.bankrepo.deleteById(id);

    }
}
