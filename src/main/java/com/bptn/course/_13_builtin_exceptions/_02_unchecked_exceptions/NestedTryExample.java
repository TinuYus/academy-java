package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// Outer most try catch block
		try {
			int[] nums = {1, 2, 3, 4};
			int divisors = 0;
			String txt = null;
			
			//try inner try block1
			try {
				int result = 10/0; //Critical statement
				System.out.println("The result is: " + result);
			}
			
			catch(ArithmeticException e) {
				System.out.println("An arithmetic exception occured: " + e.getMessage());
			}
			
			//inner try block 2
			try {
				
				System.out.println("The length of string is: " + txt.length());
			}
			
			catch(NullPointerException e) {
				System.out.println("A null pointer exception occured: " + e.getMessage());
			}
			
			// inner try block 3
			try {
				
				System.out.println(nums[4]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("An ArrayIndexOutOfBounds exception occured: " + e.getMessage());
			}
			
				
		}
		 catch(Exception e) {
		    	
			 System.out.println("A general exception occured: " + e.getMessage());
				}
		 System.out.println("The statements after the try/catch block");
		    }
	}


