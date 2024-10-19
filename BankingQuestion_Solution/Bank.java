package com.bank;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bank {
	public final static String name = "Ansh Finance Ltd.";
	public final static String ifsc = "ANSH01234";
	public static Locale locale;
	public static ResourceBundle resourceBundle;

	static Customer getNewCustomerInstance(String name) {
		Customer customer = new Customer();
		customer.setName(name);
		Account account = new Account();
		account.setNumber(123456789);
		customer.setAccount(account);
		return customer;
	}

	static void setPrefferedLanguage() {
		System.out.println(" i could figure out logic to use this ");
	}
}