package com.bptn.course._14_custom_exceptions._01_custom_exception1;

public class BankAccount {
	private double balance;
	private String accountNumber;
	
	
	public BankAccount(double balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		
		
	
	}
	
	
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount > balance) {
			double needs = amount- balance;
			
			throw new InsufficientFundsException(needs);
		}
		
		balance -= amount; //balance = balance - amount
		
		System.out.println("Withdraw of $" + amount + "successful. New balance");
	}
	
}
