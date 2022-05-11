package com.example.demo.Account;

import com.example.demo.Account.AccountType;

public class AccountWithdraw extends Account {
    AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
