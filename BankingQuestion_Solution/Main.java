package com.bank;

import java.util.Scanner;
public class Main {
	static Customer customer;
	static Scanner sc;
	public static void menu() {
		System.out.printf("""
				1. %-30s
				2. %-30s
				3. account details
				4. change account holder's name
				5. print passbook
				6. %-30s:
				""", "withdraw money", "deposit money", "exit");
	}

	static {
		sc = new Scanner(System.in);
		System.out.println("Welcome to " + Bank.name + " Thankyou for choosing us");
		System.out.print("Enter your name : ");
		customer = Bank.getNewCustomerInstance(sc.nextLine());
		System.out.print("Kindly enter your initial balance : ");
		customer.deposit(sc.nextInt());
	}

	public static void main(String[] args) {
		int ch = 0;
		do {
			menu();
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter amount : ");
				customer.withdraw(sc.nextInt());
				break;
			case 2:
				System.out.print("Enter amount : ");
				customer.deposit(sc.nextInt());
				break;
			case 3:
				System.out.print(customer);
				break;
			case 4:
				System.out.print("Enter new name : ");
				customer.setName(sc.nextLine());
				break;
			case 5:
				System.out.println("we are currently working on it");
				break;
			case 6:
				System.out.println("Thankyou for Banking with Us");
				break;
			default:
				System.out.println("invalid choise type!!");
			}
		} while (ch != 6);
	}
}
