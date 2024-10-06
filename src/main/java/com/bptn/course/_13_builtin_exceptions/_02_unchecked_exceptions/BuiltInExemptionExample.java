package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class BuiltInExemptionExample {
	//create a method which checks if a number is positive or negative
	/*throws always comes in the methods signature which warns that the method 
	 * has the ability to to encounter a situation and should be in a position to handle it
	 */
	//IllegalArguementException is a sub class of runtime exception
	//throws is optional in case of unchecked exception
	//throws is used in case of checked exception (custom exception which is created as a checked exception)
	//throw is used explicitly within a method block code
	//throw creates an instance of exception (or sub-classes) it tries to signal the program that something has gone wrong
	public static void checkPositive(int number) throws IllegalArgumentException{
		if(number<0) {
			throw new IllegalArgumentException("The number must be positive");
		}
		
		System.out.println("The number is positive"); // this will not fail
		
	}

	public static void main(String[] args) {

		try {
			checkPositive(10); //this call is fine
			checkPositive(-10);
		}
		
		catch(IllegalArgumentException e) {
			
			System.out.println("Caught an exception: " + e.getMessage());
			
		}

	}

}
