package com.bank;

import java.text.NumberFormat;

public class Account {
	private long number;
	private double balance;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		String accountNumber = Main.resourceBundle.getString("accountNumber");
		String availableBalance = Main.resourceBundle.getString("availableBalance");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Main.locale);

		return "{ " + accountNumber + number + ", " + availableBalance + numberFormat.format(balance) + " }";
	}

}