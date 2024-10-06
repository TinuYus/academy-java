package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class Main1 {

	void method() {
		
		//outer try-catch block
		try {
				//inner catch block
			try {
				int[] arr = {1,2,3,4};
				System.out.println(arr[0]); // this will not fail
				System.out.println(arr[5]); // this is a critical statement
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic exception occured"); // this will not fail
			}
		}
		catch(NullPointerException e) {
			System.out.println("ArrayIndexOutOfBounds is handled in the outer catch block."); // this will not fail
		
		    }
		 
	        
	    }

	  // main() method to run the program
	    public static void main(String args[]) {
	        Main1 nestedTryBlockSolutionObject = new Main1();
	        nestedTryBlockSolutionObject.method();

	}

}
