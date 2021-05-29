package com.example.bank_spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String last_name;
    @Column(unique = true)
    private String CIN;
    private String birth_date;
    private String e_mail;
    private String phone_nbr;
    @OneToMany(targetEntity = Bank_Account.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_account", referencedColumnName = "id")
    private List<Bank_Account> accounts;

}
