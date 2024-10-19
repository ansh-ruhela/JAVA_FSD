package com.bank;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
public class Main {
	static Customer customer;
	static Scanner sc;
	static Locale locale = Locale.of("en", "IN");
	static ResourceBundle resourceBundle = ResourceBundle.getBundle("ResourceBundle", locale);

	static {
		sc = new Scanner(System.in);
		System.out.println("Welcome to " + Bank.name + " Thankyou for choosing us");
		System.out.print("Enter your name : ");
		customer = Bank.getNewCustomerInstance(sc.nextLine());
		System.out.print("Kindly enter your initial balance : ");
		customer.deposit(sc.nextInt());
		
	}

	public static void setting() {
		String menu = resourceBundle.getString("settingMenu");
		int ch = 0;
		do {
			System.out.print(menu);
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				String languageChoise = resourceBundle.getString("settingMenuLanguageChoise");
				System.out.print(languageChoise);
				switch (sc.nextInt()) {
				case 1:
					locale = Locale.of("hi", "IN");
					break;
				case 2:
					locale = Locale.of("en", "IN");
					break;
				default:
					System.out.println(resourceBundle.getString("invalidChoise"));
				}
				resourceBundle = ResourceBundle.getBundle("ResourceBundle", locale);
				menu = resourceBundle.getString("settingMenu");
				break;
			case 2:
				break;
				default:
					System.out.println(resourceBundle.getString("invalidChoise"));
			}
			
			
		}while(ch != 2);
		return;
	}

	public static void main(String[] args) {
		int ch = 0;
		String menu = resourceBundle.getString("mainMenu");
		do {
			System.out.print(menu);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print(resourceBundle.getString("enterWithdrawAmount"));
				customer.withdraw(sc.nextInt());
				break;
			case 2:
				System.out.print(resourceBundle.getString("enterDepositAmount"));
				customer.deposit(sc.nextInt());
				break;
			case 3:
				System.out.println(customer);
				break;
			case 4:
				System.out.print(resourceBundle.getString("enterNewName"));
				sc.nextLine();
				customer.setName(sc.nextLine());
				break;
			case 5:
				System.out.println("we are currently working on it");
				break;
			case 6:
				setting();
				menu = resourceBundle.getString("mainMenu");
				break;
			case 7:
				System.out.println(Main.resourceBundle.getString("thankyou"));
				break;
			default:
				System.out.println(resourceBundle.getString("invalidChoise"));
			}
		} while (ch != 7);
	}
}
