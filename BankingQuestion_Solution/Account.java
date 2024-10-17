package com.bank;

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
		return "{ Account Number = " + number + " Balance = xxxx" + " }\n";
	}

}
