package com.example.bank_spring;

import com.example.bank_spring.Repositories.Account_Repository;
import com.example.bank_spring.Repositories.Bank_Repository;
import com.example.bank_spring.Repositories.ClientRepository;
import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import com.example.bank_spring.services.AccountService;
import com.example.bank_spring.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class BankSpringApplication {

    public static void main(String[] args) { SpringApplication.run(BankSpringApplication.class, args);


    }
}
