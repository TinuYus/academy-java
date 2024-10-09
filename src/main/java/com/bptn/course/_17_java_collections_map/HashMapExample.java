package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// create an object
		Map<String,Integer> map = new HashMap<>();	
		//K --> Key --> String
		//V --> Value --> Integer
		map.put("Jane", 254);
		map.put("John", 758);
		map.put("Helena", 923);
		map.put("Jane", 254);
		map.put("Jessica", 536);
		map.put("Tom", 339);
		map.put(null, 774);
		map.put(null, 348);
		map.put("Amy", null);
		map.put("Mark", null);
		
		System.out.println(map);
		
		//Key set method --> return set view of keys
		//
		for(String s: map.keySet()) {
			System.out.println("Name: " + s + " Age " +map.get(s));
			
		//retrieve the age of Helena and print it to the console
			System.out.println("Age of Helena is: " + map.get("Helena"));
		
		//update the value of an existing key
			map.replace("Jane", 536);
			System.out.println("New age of Jane is: " + map.get("Jane"));
		
		//Check if the key is present in the map containsKey(Object K) method
		if(map.containsKey("Jane")) {
			System.out.println("The key is existing in the map");
		    }
		else {
			System.out.println("The key is not existing in the map");
		}
		
		//Check if the value is present in the map using containsValue(Object V)
		if(map.containsValue(536)) {
			System.out.println("The value is existing in the map");
		    }
		else {
			System.out.println("The value is not existing in the map");
			}
		
		//putIfAbsent(Object k, Object v) is used to add key-value pair if a key does not exist in the map
		map.putIfAbsent("Jane", 658); //It does not override the age 536 for Jane
			System.out.println(map);
		
		}
		
		//Iterating through the HashMap using entrySet() method
		for(Map.Entry<String, Integer> s : map.entrySet()) {
			System.out.println("Name " + s.getKey() + " Age " + s.getValue());
		}
	}

}


//Major Takeaways
//1. Does it preserve insertion order? No
//2. Does keys allow null values? Yes maximum of 1 null value. Similar to a set
//3. Does values allow null values? Yes it allows null values. Multiple null values similar to a list
//4. Does key allow duplicates? If we try to add a key once again, it overrides the previous value instead of creating a new <K,V> pair
//5. Does value allow duplicates? Yes