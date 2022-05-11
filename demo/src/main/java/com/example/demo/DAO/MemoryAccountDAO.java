package com.example.demo.DAO;

import com.example.demo.Account.Account;
import com.example.demo.Account.AccountType;
import com.example.demo.Account.AccountWithdraw;
import com.example.demo.DAO.AccountDAO;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO {
    private final List<Account> accountList = new ArrayList<>();

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return this.accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateNewAccount(Account account) {
        accountList.remove(accountList.size() - 1);
        accountList.add(account);
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        for (Account temp : accountList) {
            if(temp.getClientID().equals(clientID) && temp.getId().equals(accountID)){ return temp; }
        }
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        for (Account temp : accountList) {
            if(temp.getClientID().equals(clientID) && temp.getId().equals(accountID) && temp.getAccountType().equals(AccountType.FIXED)){ return (AccountWithdraw) temp; }
        }
        return null;
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        List<Account> list = new ArrayList<>();
        for (Account temp : accountList) {
            if(temp.getClientID().equals(clientID) && temp.getAccountType().equals(accountType)){ list.add(temp); }
        }
        return list;
    }
}