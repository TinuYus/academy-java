package com.bptn.course._14_custom_exceptions._01_custom_exception1;

//We can extend either exception class or runtime exception class
public class InsufficientFundsException extends Exception {
	
	private double amount;

	public InsufficientFundsException(double amount) {
		
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	

}
