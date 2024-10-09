package com.bptn.course._17_java_collections_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> linked = new LinkedHashMap<>();
		
		linked.put("Jane", 254);
		linked.put("John", 758);
		linked.put("Helena", 923);
		linked.put("Jane", 742);
		linked.put("Jessica", 536);
		linked.put("Tom", 339);
		linked.put(null, 774);
		linked.put(null, 348);
		linked.put("Amy", null);
		linked.put("Mark", null);
		
		System.out.println(linked);
		
		//Access the value in linkedHashMap
		
		System.out.println("Jane's age is " + linked.get("Jane"));
		
		//Loop over the LinkedHashMap using entrySet()
		for(Map.Entry<String, Integer> s : linked.entrySet()) {
			System.out.println("Name: " + s.getKey() + "Age: " + s.getValue() );
		}
		
		//Access the map using iterator
		Iterator<Map.Entry<String, Integer>> entry = linked.entrySet().iterator();
		
		while(entry.hasNext()) {
			Map.Entry<String, Integer> ent = entry.next();
			System.out.println("Key: " + ent.getKey() + ", Value: " + ent.getValue());
			
			
		}
		
	}

}


//Major Takeaways
//1. Does it preserve insertion order? Yes
//2. Does keys allow null values? Yes maximum of 1 null value.
//3. Does values allow null values? Yes it allows null values. Multiple null values similar to a list
//4. Does key allow duplicates? If we try to add a key once again, it overrides the previous value instead of creating a new <K,V> pair and still maintains insertion order
//5. Does value allow duplicates? Yes