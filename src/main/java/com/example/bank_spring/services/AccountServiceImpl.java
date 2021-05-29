package com.example.bank_spring.services;

import com.example.bank_spring.Repositories.Account_Repository;
import com.example.bank_spring.entities.Bank_Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private Account_Repository accrepo;

    @Override
    public List<Bank_Account> show_Account() {
        return accrepo.findAll();
    }

    @Override
    public Bank_Account Add_Account(Bank_Account acc) {
        return this.accrepo.save(acc);

    }

    @Override
    public void Delete_Account(int id) {
        this.accrepo.deleteById(id);

    }

    @Override
    public void consulter(int id) {
        this.accrepo.findById(id).orElse(null);
    }

}
