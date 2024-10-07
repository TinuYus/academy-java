package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercises;

public class StudentList {
	import java.util.*;

	   // main method for testing
	   public static void main(String[] args) {
	      ArrayList<Student> roster = new ArrayList<Student>();
	      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
	      
	      // add your code here
	      
	      Student s2 = new Student("Ayanna", "ayanna@gmail.com", 789012);
	      
	      roster.add(s2); //Added the 2nd student intothe ArrayList
	      System.out.println(roster);
	   }
	 }




