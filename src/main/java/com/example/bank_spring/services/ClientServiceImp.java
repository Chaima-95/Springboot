package com.example.bank_spring.services;

import com.example.bank_spring.Repositories.Account_Repository;
import com.example.bank_spring.Repositories.ClientRepository;
import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImp implements ClientService{
    @Autowired
    ClientRepository clientrep;
    @Autowired
    Account_Repository account_rep;

    @Override
    public Client Add_Client(Client client) {
        return this.clientrep.save(client);
    }

    @Override
    public List<Client> listClient() {
        return clientrep.findAll() ;
    }

    @Override
    public void Delete_Client(int id) {
        this.clientrep.deleteById(id);
    }

    @Override
    public void saveClient(Client client) {
        this.clientrep.save(client);
    }

    @Override
    public Client Update(int id) {
        Optional<Client> optional = clientrep.findById(id);
        Client client = null;
        if(optional.isPresent()){
            client = optional.get();
        }else{
            throw new RuntimeException(("Client does not exist for id :: "+id));
        }
        return client;
    }

    @Override
    public Client consult_cl(int id) {
        return this.clientrep.getById(id);
    }

    @Override
    public Client findClientById(int id) {
        return this.clientrep.findClientById(id);
    }
}
