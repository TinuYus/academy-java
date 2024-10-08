package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//Create  an object of HashSet
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Kiwi");
		hashSet.add("Pawpaw");
		hashSet.add("Watermelon");
		hashSet.add("Mango");
		hashSet.add("Watermelon");
		hashSet.add("Kiwi");//It does not allow duplicates
		hashSet.add(null); //It allows null values
		
		System.out.println("The HashSet of fruits: " + hashSet);
		

	}

}

//Major key Takeaways:
//1. Insertion Order - NO
//2. It allows null values? It allows max 1 null value because it does not allow duplicates
//3. It allows duplicates? - NO
//4.Underlying implementation - Hash Table
//5.Is HashSet indexed? NO
