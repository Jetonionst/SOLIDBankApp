package com.example.demo;

import com.example.demo.Account.AccountType;
import com.example.demo.Service.AccountCreationService;

public class BankCore {
    private static long id = 1;
    private long lastAccountNumber = 1;
    private AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation){
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientID){
        if(accountType==null){
            System.out.println("There is no such account type!");
            return;
        }
        accountCreation.create(accountType, id, clientID, lastAccountNumber);
        incrementLastAccountNumber();
    }
    private void incrementLastAccountNumber(){
        lastAccountNumber+=1;
    }
}