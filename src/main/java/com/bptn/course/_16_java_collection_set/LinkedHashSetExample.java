package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		//Create LinkedHashSet object
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Kiwi");
		linkedHashSet.add("Pawpaw");
		linkedHashSet.add("Watermelon");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Watermelon");
		linkedHashSet.add("Kiwi");//It does not allow duplicates
		linkedHashSet.add(null); //It allows null values
		
		System.out.println("The HashSet of fruits: " + linkedHashSet);

	}

}

//Major key Takeaways:
//1. Insertion Order - Yes
//2. It allows null values? It allows max 1 null value because it does not allow duplicates
//3. It allows duplicates? - NO
//4.Underlying implementation - HashTable and Doubly LinkedList
//5.Is HashSet indexed? NO
