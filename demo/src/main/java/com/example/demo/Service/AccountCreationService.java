package com.example.demo.Service;

import com.example.demo.Account.AccountType;

public interface AccountCreationService{
    default void create(AccountType accountType, long bankID, String clientID, long accountID){}
}