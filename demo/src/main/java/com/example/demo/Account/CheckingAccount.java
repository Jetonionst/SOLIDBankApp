package com.example.demo.Account;

import com.example.demo.Account.AccountType;
import com.example.demo.Account.AccountWithdraw;

public class CheckingAccount extends AccountWithdraw {
    public CheckingAccount(String id, String clientID, double balance) {
        super(AccountType.CHECKING, id, clientID, balance, true);
    }
}
