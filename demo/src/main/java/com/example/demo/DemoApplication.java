package com.example.demo;

import com.example.demo.Client.MyCLI;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;


@SpringBootApplication
public class DemoApplication {
	public static void help() {
		System.out.println("Welcome to CLI bank service! Enter operation number: ");
		System.out.println("1 - Show Accounts");
		System.out.println("2 - Create Account");
		System.out.println("3 - Deposit");
		System.out.println("4 - Withdraw");
		System.out.println("5 - Transfer");
		System.out.println("6 - Help");
		System.out.println("7 - Exit");
	}
	public static void exit() {
		System.out.println("Goodbye!");
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
		AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
		MyCLI myCLI = context.getBean(MyCLI.class);

		help();
		while (true) {
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();

			switch (str){
				case "1":
					accountBasicCLI.getAccounts("1");
					break;
				case "2":
					System.out.println("Choose account type: \n[CHECKING, SAVING, FIXED]");

					accountBasicCLI.createAccountRequest("1");
					break;
				case "3":
					System.out.println("Deposit has not been released yet.");
					break;
				case "4":
					System.out.println("Deposit has not been released yet.");
					break;
				case "5":
					System.out.println("Transfer has not been released yet.");
					break;
				case "6":
					help();
					break;
				case "7":
					exit();
					break;
			}
		}
	}

}
