package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
	
	//create a method which reads a file
	public static void readFile(String fileName) throws FileNotFoundException {
		//create an object of file reader
		
		FileReader fileReader = new FileReader(fileName);
	}

	public static void main(String[] args) {
		try {
			readFile("Result.txt");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

	}

}

//FileNotFoundException is a checked exception where the java wants you to deal with it
//When we call a method which has a checked exception in the method signature
//Java compiler gives you two options
//1st option is to surround 