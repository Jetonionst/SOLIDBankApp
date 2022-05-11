package com.example.demo.Account;

import com.example.demo.Account.AccountDeposit;
import com.example.demo.Account.AccountType;

public class FixedAccount extends AccountDeposit {
    public FixedAccount(String id, String clientID, double balance) {
        super(AccountType.FIXED, id, clientID, balance, false);
    }
}
