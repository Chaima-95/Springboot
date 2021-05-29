package com.example.bank_spring.services;

import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;

public interface ClientService {

    Client Add_Client(Client client);
    List<Client> listClient();
    void Delete_Client(int id);
    void saveClient(Client client);
    Client Update(int id);
     Client consult_cl(int id);
    Client findClientById(int id);

}
