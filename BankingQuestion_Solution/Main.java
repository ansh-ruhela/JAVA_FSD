package com.bank;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
public class Main {
	static Customer customer;
	static Scanner sc;
	static Locale locale;
	static ResourceBundle resourceBundle;

	public static void menu() {
		String menu = resourceBundle.getString("menu");
		System.out.printf(menu);
	}

	static {
		sc = new Scanner(System.in);
		System.out.println("Welcome to " + Bank.name + " Thankyou for choosing us");
		System.out.print("Enter your name : ");
		customer = Bank.getNewCustomerInstance(sc.nextLine());
		System.out.print("Kindly enter your initial balance : ");
		customer.deposit(sc.nextInt());
		System.out.print("Select your preffered language :\n1.Hindi\n2.English\n\t\t\t:");
		switch (sc.nextInt()) {
		case 1:
			locale = Locale.of("hi", "IN");
			break;
		case 2:
			locale = Locale.of("en", "US");
			break;
		default:
			locale = Locale.getDefault();
			break;
		}
		resourceBundle = ResourceBundle.getBundle("ResourceBundle", locale);

	}

	public static void main(String[] args) {
		int ch = 0;
		do {
			menu();
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print(resourceBundle.getString("enterYourName"));
				customer.withdraw(sc.nextInt());
				break;
			case 2:
				System.out.print(resourceBundle.getString("enterDepositAmount"));
				customer.deposit(sc.nextInt());
				break;
			case 3:
				System.out.print(customer);
				break;
			case 4:
				System.out.print(resourceBundle.getString("enterNewName"));
				customer.setName(sc.nextLine());
				break;
			case 5:
				System.out.println("we are currently working on it");
				break;
			case 6:
				System.out.println("Thankyou for Banking with Us");
				break;
			default:
				System.out.println(resourceBundle.getString("invalidChoise"));
			}
		} while (ch != 6);
	}
}
