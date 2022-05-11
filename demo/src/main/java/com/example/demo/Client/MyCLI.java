package com.example.demo.Client;

import com.example.demo.Account.AccountType;

import java.util.Scanner;


public class MyCLI implements CLIUI {
    private Scanner scanner;

    MyCLI() {
        this.scanner = new Scanner(System.in);
    }
    MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public double requestClientAmount(){
        return 0;
    }
    public String requestClientAccountNumber(){
        return "";
    }
    public AccountType requestAccountType(){
        switch(scanner.next()){
            case "FIXED": return AccountType.FIXED;
            case "CHECKING": return AccountType.CHECKING;
            case "SAVING": return AccountType.SAVING;
        }
        return null;
    }
}
