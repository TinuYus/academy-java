package com.bptn.course._15_java_collection_list._01_arraylist._coding._arraylist_coding_exercises._coding_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
        
	       List<String> nameList = new ArrayList<String>();

	       nameList.add("Robert");
	       nameList.add("Samson");
	       nameList.add("Alex");
	       nameList.add("William");
	       
	       System.out.println("Elements of List: " + nameList);
	       
	       //Declare an array whose length is equals to the size of the arraylist
	       String[] output = new String[nameList.size()];
	       output =nameList.toArray(output);
	       
	       //Print the element in the Array
	       System.out.println("Elements of Array: " + Arrays.toString(output));
	}

}
