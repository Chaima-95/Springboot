package com.example.bank_spring.Controllers;

import com.example.bank_spring.entities.Bank_Account;
import com.example.bank_spring.entities.Client;
import com.example.bank_spring.services.AccountService;
import com.example.bank_spring.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class BankController {
    @Autowired
    private ClientService c_serv;
    @Autowired
    private AccountService acc_serv;

    @GetMapping("/showNewAccount")
    public String showNewAccount(Model m) {
        Bank_Account b = new Bank_Account();
        m.addAttribute("account", b);
        Collection<Client> clients=this.c_serv.listClient();
        m.addAttribute("cl", clients);
        return "newAccount";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(@ModelAttribute("account") Bank_Account ba) {
        acc_serv.Add_Account(ba);
        return "redirect:/accounts";
    }

    @GetMapping("/accounts")
    public String viewListOfaccounts(Model m) {
        m.addAttribute("accountlist", acc_serv.show_Account());
        return "accounts";
    }

    @GetMapping("/showAccounts/{id}")
    public String showAccounts(@PathVariable(value = "id") int id, Model m){
        Client c = c_serv.findClientById(id);
        List <Bank_Account> ba = c.getAccounts();
        m.addAttribute("accounts", ba);
        return"client_accounts";
    }

}
