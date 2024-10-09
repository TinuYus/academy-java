package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		numbers.put(5, "Five");
		numbers.put(6, "Six");
		numbers.put(7, "Seven");
		numbers.put(8, "Eight");
		numbers.put(9, "Nine");
		numbers.put(10, "Ten");
		
		//print map using entrySet()
		
		for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		numbers.remove(7);
		numbers.put(11, "eleven");
		
		//print map using keySet()

		for(Integer key: numbers.keySet()) {
			System.out.println(key + " : " + numbers.get(key));
		}
	}

}
