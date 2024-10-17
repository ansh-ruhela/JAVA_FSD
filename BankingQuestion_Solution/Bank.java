package com.bank;

public class Bank {
	public final static String name = "Ansh Finance Ltd.";
	private Customer customer;
	public final static String ifsc = "ANSH01234";

	static Customer getNewCustomerInstance(String name) {
		Customer customer = new Customer();
		customer.setName(name);
		Account account = new Account();
		account.setNumber(123456789);
		customer.setAccount(account);
		return customer;
	}

	static void setPrefferedLanguage() {
		System.out.println(" i dont know how to use locale and resource bundle ");
	}
}
