package co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.controller;


import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities.AccountTypeEntity;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities.ClientEntity;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities.ClientTypeEntity;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.services.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/account")
public class AccountTypeController {

    @Autowired
    private AccountServiceImpl accountService;

    @GetMapping("/get_all_account_type")
    public List<AccountTypeEntity> getAllCountType(){
        return accountService.getAllAccountType();
    }

    @GetMapping("/get_all_clients")
    public List<ClientEntity> getAllClients(){

       return accountService.getAllClient();
    }

    @GetMapping("/get_all_client_type")
    public List<ClientTypeEntity> getAllClientType(){
        return accountService.getAllClientType();
    }
}
