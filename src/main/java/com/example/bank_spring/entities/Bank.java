package com.example.bank_spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private int code;
    private String address;
    private int agency_nbr;
    @OneToMany(targetEntity = Client.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Bank_id", referencedColumnName = "id")
    private Collection<Client> client;

}
