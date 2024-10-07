package com.bptn.course._15_java_collection_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// 1st way of declaring ArrayList is relying on concrete implementation which does not follow Dependency Inversion Principle
		//ArrayList<Integer> arrayList = new ArrayList<>;
		
		//2nd way of declaring ArrayList is relying on abstraction implementation which follows Dependency Inversion Principle
		
		List<Integer> arrayList = new ArrayList<>();
		
		//add values into arrayList
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(300);
		arrayList.add(400);
		arrayList.add(null);
		
		System.out.println(arrayList);
		
		//The size of the arrayList
		System.out.println("The size of the arraylist: " + arrayList.size());
		
		//Access the first element
		
		System.out.println("The first elemnt is: " + arrayList.get(0));	
		
		//update the element at 2
		arrayList.set(2, 250);
		System.out.println("Updated array list is: " + arrayList);	
		
		//update the null value
		arrayList.set(5, 450);
		System.out.println("Updated array list is: " + arrayList);
		
		//remove an element from index 4
		System.out.println("The element removed is: " + arrayList.remove(4));	
		
		//The size of an array list
		System.out.println("The first elemnt is: " + arrayList.size());	
		
		//Accessing the element using the for loop
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));	
		}
		
		//Access the element using for-each loop
		for (Integer element: arrayList) {
			System.out.println(element);	
		}
		
		
	

	}

}

//<> diamond operators --> Java Generic
//1. SOLID principles.
//D >Dependency Inversion Principle
//We need to rely on abstraction rather on concrete implementation
