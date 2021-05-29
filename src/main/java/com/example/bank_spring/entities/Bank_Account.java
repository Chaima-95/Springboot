package com.example.bank_spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank_Account  {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String account_num;
    private String creation_date;
    private String account_type;
    private double account_solde;
    private int client_account;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
