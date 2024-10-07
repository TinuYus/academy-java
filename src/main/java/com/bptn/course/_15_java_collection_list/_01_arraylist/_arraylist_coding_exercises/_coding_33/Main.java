package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercises._coding_33;

public class Main {
	import java.util.List;
	import java.util.ArrayList;
	    
	    // Complete the functionality of the method below
	    public static  List<String> convertArrayToList(String[] inputArray) {
	        
	        // Create a new ArrayList of String. 
	    	List<String> updatedList = new ArrayList<>();

	        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
	    	for(String s : inputArray) {
	    		updatedList.add(s);
	    	}
	        // return the new list with elements.
	    	return updatedList;
	    }
	 
	   
	    // Do not modify the code below
	    public static void main(String[] args) {

	        String [] cars = {"Volvo","Honda","Ford"};

	        List<String> arraylist = convertArrayToList(cars);

	        System.out.println(arraylist);
	    }
	}


}
