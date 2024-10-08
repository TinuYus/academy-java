package com.bptn.course._15_java_collection_list;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Create an object from treeSet
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Kiwi");
		treeSet.add("Pawpaw");
		treeSet.add("Watermelon");
		treeSet.add("Mango");
		treeSet.add("Watermelon");
		treeSet.add("Kiwi");//It does not allow duplicates
		
		System.out.println("The HashSet of fruits: " + treeSet);

	}

}

//Major key Takeaways:
//1. Insertion Order - Natural ascending order
//2. It allows null values? No null values. It throws a NullPointerException
//3. It allows duplicates? - NO
//4.Underlying implementation - HashTable and Doubly LinkedList
//5.Is HashSet indexed? NO
