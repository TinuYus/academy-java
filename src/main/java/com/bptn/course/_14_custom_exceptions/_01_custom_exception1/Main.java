package com.bptn.course._14_custom_exceptions._01_custom_exception1;

public class Main {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount (1000, "43589");
		
	try {	
		ba.withdraw(200);
		ba.withdraw(600);
		ba.withdraw(600);
	} catch (InsufficientFundsException e) {
		System.out.println("Insufficient funds. You need $" + e.getAmount() + "more to complete this transaction");
	}
		
}
	
}
