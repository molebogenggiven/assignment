package co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.services;

import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.dao.AccountTypeRepository;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.dao.ClientRepository;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.dao.ClientTypeRepository;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities.AccountTypeEntity;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities.ClientEntity;
import co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities.ClientTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl {

    @Autowired
    private AccountTypeRepository accountTypeRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientTypeRepository clientTypeRepository;


    public List<AccountTypeEntity> getAllAccountType(){

        return accountTypeRepository.findAll();
    }

    public List<ClientEntity> getAllClient(){
      return   clientRepository.findAll();
    }

    public List<ClientTypeEntity> getAllClientType(){
      return   clientTypeRepository.findAll();
    }
}
