package com.bptn.course._16_java_collection_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetManipulation {
	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
		Set<String> linked = new LinkedHashSet<>();
		
		linked.add("A");
		linked.add("B");
		linked.add("C");
	

		// Print the size of the set
		
		System.out.println("Set size :" + linked.size());
		
		

		// Use for each loop to print the elements in the set
		System.out.println("Elements in the set (using for loop):");
		for(String s: linked) {
			
			System.out.println("Element: " + s);
			
		}

		// Use iterator to print the elements in the set
		System.out.println("Elements in the set (using iterator):");
		Iterator<String> iterate = linked.iterator();
		
		while(iterate.hasNext()) {
			System.out.println("Element: " + iterate.next());
		}

		// Use remove() method to remove the element A from the set
		linked.remove("A");
		System.out.println("Set after using remove(): " + linked);
		
		
        
		// Use contains() method to check if the element B exists in the set
		if(linked.contains("B")) {
			System.out.println("Element 'B' exists in set ");
		}

		// Use clear() method to remove all elements from the set
		linked.clear();

        // Print the set to show that it is empty.
		System.out.println("Set after using clear(): " + linked);
	}

}
