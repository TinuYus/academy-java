package com.bptn.course._04_arrays;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		//Declare and initialize an arrat with 6 values
		int[] myArray = {3,5,7,9,11,13};
		
		//Print the first and second element in the console 
		System.out.println("Second element: " + myArray[0]);
		
		System.out.println("Second element: " + myArray[1]);
		
		//Update the first element to 30
		myArray[3] = 30;
		System.out.println("Updated first element: " + myArray[0]);
		
		//Updating the last element of an array using the length property (without the index)and set it to 130
		myArray[myArray.length-1] = 130;
		System.out.println("Updated last element: " + myArray[myArray.length-1]);
		
		//Use for loop to print values from 1 to 10
		for(int i=1; i<=10; i++) {System.out.println(i);
		}
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		//To print the values in reverse order
		for (int i=myArray.length-1; i>=0; i--) {
			System.out.println(myArray[i]);
		}
		
		//Enhanced for-loop (for each loop)
		for(int element: myArray) {
			System.out.println(element);
		}
		
		//How to print the elements in the array without using the for-loop
			System.out.println(Array.toString(myArray));
		
		
		String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
		int index = 1;
		index--;
		System.out.println(names[index-1]);
		System.out.println(names[names.length-1]);        

		}
}
