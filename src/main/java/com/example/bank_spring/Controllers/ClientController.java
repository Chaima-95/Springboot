package com.example.bank_spring.Controllers;

import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import com.example.bank_spring.services.AccountService;
import com.example.bank_spring.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService c_serv;

    @GetMapping("/")
    public String viewHomePage(Model m) {
        m.addAttribute("");
        return "redirect:/clients";
    }

    @GetMapping("/clients")
    public String viewListOfClients(Model m) {
        m.addAttribute("listClients", c_serv.listClient());
        return "client_page";
    }

    @GetMapping("/showNewClientForm")
    public String showNewClientForm(Model m) {
        Client client = new Client();
        m.addAttribute("client", client);
        return "new_client";
    }

    @RequestMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Client client) {
        c_serv.saveClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value = "id") int id,
                                 Model m){
        try{
        Client c = c_serv.Update(id);
        m.addAttribute("client",c);
        } catch (Exception e ){
            m.addAttribute("exception",e);
        }
        return "update";
    }
    @GetMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable (value = "id") int id){
    this.c_serv.Delete_Client(id);
    return "redirect:/clients";
    }

}
