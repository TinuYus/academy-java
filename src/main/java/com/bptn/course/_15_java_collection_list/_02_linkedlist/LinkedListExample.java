package com.bptn.course._15_java_collection_list._02_linkedlist;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> colors = new LinkedList<>();
		
		//Add elements to the list
		
		colors.addFirst("red");
		
		//Add elements to the end of the list
		
		colors.addLast("Burgundy");
		
		System.out.println("LinkedList after adding colors: " + colors);
		
		//Remove element from the beginning
		
		colors.removeFirst();
		
		//Remove element from the end
		
		colors.removeLast();
		
		System.out.println("LinkedList after adding colors: " + colors);
		
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Beige");
		colors.add("Orange");
		colors.add("Indigo");
		
		System.out.println("LinkedList after adding colors: " + colors);
		
		//Remove the element at index 1
		
		colors.remove(1);
		
		System.out.println("LinkedList after removing index 1: " + colors);
		
		//Add an element at index 1
		
		colors.add(1, "Brown");
		
		System.out.println("LinkedList after adding element at index 1: " + colors);
		
		//Access an element at index 2
		System.out.println("Access an element at index 2: " + colors.get(2));
		
		//colors.add(null);
		
		System.out.println("Updated LinkedList: " + colors);
		
		//Access elements in the LinkedList using the for loop
		
		for(int i = 0; i<colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		
		//Access elements in the LinkedList using for each loop
		
		for(String element : colors) {
			System.out.println(element);
		}
		
		//Access the element using an Iterator
		
		Iterator<String> hue  = colors.iterator();
		
		while(hue.hasNext()) {
			System.out.println("Accessing next element using hasNext " + hue.next());
		}
		
		//Remove an element using Iterator
		
		Iterator<String> gradient  = colors.iterator();
		
		while(gradient.hasNext()) {
			String shade = gradient.next();
			if(shade.equals("Beige")) {
			
			System.out.println("The color is removed successfully" + colors);
			
			}
		}
		
		
		//Add an element using a list iterator(sub interface of iterator)
		ListIterator <String> listIterator = colors.listIterator();
		while(listIterator.hasNext()) {
			String color = listIterator.next();
			if(color.equals("Orange")) {
				listIterator.add("Black");
				System.out.println("LinkedList after adding color: " + colors);
			}
		}
		
		
		

	}

}
