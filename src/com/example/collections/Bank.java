package com.example.collections;

public class Bank {
	private String accountNumber;
	private double balance;

	public Bank(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Bank bank = (Bank) obj;
		if (this.accountNumber == bank.accountNumber) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		int result = this.accountNumber.hashCode();
		result = result;
		return result;
	}

	public static void main(String[] args) {
		Bank bank1 = new Bank("34515773474", 25000.9);
		Bank bank2 = new Bank("34515773474", 10500.3);
		System.out.println(".equal():" + bank1.equals(bank2) + "==" + (bank1 == bank2));
		System.out.println(bank1.hashCode());
		System.out.println(bank2.hashCode());
	}

}
