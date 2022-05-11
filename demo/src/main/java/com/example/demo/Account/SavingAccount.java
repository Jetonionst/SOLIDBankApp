package com.example.demo.Account;

import com.example.demo.Account.AccountType;
import com.example.demo.Account.AccountWithdraw;

public class SavingAccount extends AccountWithdraw {
    public SavingAccount(String id, String clientID, double balance) {
        super(AccountType.SAVING, id, clientID, balance, true);
    }
}
