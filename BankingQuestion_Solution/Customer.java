package com.bank;

import java.text.NumberFormat;

public class Customer {
	public String name;
	private Account account;

	Customer() {
		this.name = null;
		this.account = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return "{ Account Holder's Name = " + name + "\nAccount Number = " + account.getNumber() + "\nBalance = "
				+ nf.format(account.getBalance()) + " }\n";
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void deposit(int amount) {
		this.account.setBalance(this.account.getBalance() + amount);
	}

	public void withdraw(int amount) {
		if (amount < account.getBalance()) {
			account.setBalance(account.getBalance() - amount);
		} else {
			System.out.println("unsufficient fund balance please try a lower amount");
		}
	}

}