package com.example.demo.Service;

import com.example.demo.Account.*;
import com.example.demo.DAO.AccountDAO;

class AccountCreationServiceImpl implements AccountCreationService {
    private final AccountDAO accountDAO;

    AccountCreationServiceImpl(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID){
        String accountNumber = String.format("%03d%06d", 1, accountID);
        Account account = null;
        switch(accountType){
            case FIXED: account = new FixedAccount(accountNumber, clientID, 0); break;
            case SAVING: account = new SavingAccount(accountNumber, clientID, 0); break;
            case CHECKING: account = new CheckingAccount(accountNumber, clientID, 0); break;
        }
        accountDAO.createNewAccount(account);
        System.out.println("New Account was created!");
    }
}
