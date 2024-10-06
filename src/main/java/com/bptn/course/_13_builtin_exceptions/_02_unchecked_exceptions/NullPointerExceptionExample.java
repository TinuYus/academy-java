package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = null;
		
		try {
			System.out.println("Length of the string is: " + text.length());
		}
		catch(NullPointerException e) {
			System.out.println("An error occured: " + e.getMessage());
		}
		
		System.out.println("Statement after the try/catch");
	}

}
