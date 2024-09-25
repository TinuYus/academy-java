package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		String s = "Hello World";
		String reversedWorld = "";
		
		//Find the total length of string and store it in a variable
		int stringLength = s.length();
		System.out.println("The length of string is " + stringLength);
		
		//substring() method to get a part of the string
		String sub = s.substring(0, 8);
		System.out.println("The substring with start index 0 and end index 8 is " + sub );
		
		String sub1 = s.substring(4);
		System.out.println("The substring with start index 4 is " + sub1 );
		
		//toLowerCase() - converts all the letters of the string to lowercase
		String lowerCaseString = s.toLowerCase();
		System.out.println("The lowercase of the string is: " + lowerCaseString);
		
		//toUpperCase() - converts all the letters of the string to uppercase
				String upperCaseString = s.toUpperCase();
				System.out.println("The uppercase of the string is: " + upperCaseString);
				
				int index = s.indexOf("World");
				System.out.println("The index of World is: " + index);
		
				//Find the the character at specified index
				char c =s.charAt(0);
				System.out.println("The character at index 0 is: " + c);
				
				for (int i = s.length()-1; i>=0; i--) {
					reversedWorld += s.charAt(i);
				}
				
				System.out.println("Reversed Word " + reversedWorld);
		
		
		
	}
}
