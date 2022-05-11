package com.example.demo;

import com.example.demo.Client.CreateAccountOperationUI;
import com.example.demo.Service.AccountListingService;

class AccountBasicCLI{
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListingService;

    AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService){
        this.accountListingService = accountListingService;
        this.bankCore = bankCore;
        this.createAccountOperationUI = createAccountOperationUI;
    }

    public void createAccountRequest(String clientID){
        bankCore.createNewAccount(createAccountOperationUI.requestAccountType(), clientID);
    }
    public void getAccounts(String clientID){
        System.out.println(accountListingService.getClientAccounts(clientID));
    }
}
