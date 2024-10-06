package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class ArithmeticExceptionExamples {

	public static void main(String[] args) {
		// critical statement
		try {
		int result = 10/0;
		
		System.out.println(result);

	    }
		// e is the object of ArithmeticException class
		catch(ArithmeticException e) {
			System.out.println("The result is: " + e.getMessage());
		}

	}		
}
