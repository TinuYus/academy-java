package com.bptn.course._17_java_collections_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		//declare an object for Tree Map
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Jane", 254);
		map.put("John", 758);
		map.put("Helena", 923);
		map.put("Jane", 742);
		map.put("Jessica", 536);
		map.put("Tom", 339);
		//map.put(null, 774); //throws NullPointerException
		//map.put(null, 348); //throws NullPointerException
		map.put("Amy", null);
		map.put("Mark", null);
		
		//Access element form TreeMap
		System.out.println("Helena's age is: " + map.get("Helena"));
		
		//Access the first key of the map
		System.out.println("The first key: " + map.firstKey());
		
		//Access the first entry of the map
		System.out.println("The first entry is: " + map.firstEntry());
	}

}

//Major Takeaways
//1. Does it preserve insertion order? No, it orders alphabetically
//2. Does keys allow null values? No it will not allow null keys.
//3. Does values allow null values? Yes it allows null values. Multiple null values similar to a list
//4. Does key allow duplicates? If we try to add a key once again, it overrides the previous value instead of creating a new <K,V> pair and still maintains insertion order of the first key value
//5. Does value allow duplicates? Yes