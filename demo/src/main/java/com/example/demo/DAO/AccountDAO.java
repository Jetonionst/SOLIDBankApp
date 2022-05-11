package com.example.demo.DAO;

import com.example.demo.Account.Account;
import com.example.demo.Account.AccountType;

import java.util.List;

public interface AccountDAO{
    List<Account> getClientAccounts(String clientID);
    void createNewAccount(Account account);
    void updateNewAccount(Account account);
    Account getClientAccount(String clientID, String accountID);
    Account getClientWithdrawAccount(String clientID, String accountID);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
