package com.example.demo.Account;

class AccountDeposit extends Account {
    AccountDeposit(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }

}