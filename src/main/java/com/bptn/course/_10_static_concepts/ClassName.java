package com.bptn.course._10_static_concepts;

public class ClassName {
	
	
	//Declare static variable
	static int staticVariable = 100;
	
	
	//Declare instance variable
	int instanceVariable;	
	
	//Declare static method
	static void staticMethod() {
		System.out.println("Static method is called..");
	}
	
	//Declare instance method
	void instanceMethod() {
		System.out.println("Instance methid is called..");
	

	//can i access an instance variable from a static method? No
	//instanceVariable=100;
	
	
	//can i access instance method within a static method?
	//instanceMethod();
	
	//can i access a static variable within an instance method?
	System.out.println("Static variable: " + staticVariable);
	
	//can i access a static method within an instance method
	staticMethod();
	}
	
	public static void main(String[] args) {
		ClassName c1 = new ClassName();
		c1.instanceMethod();
		
		//Access the static variable within the main method
		System.out.println("Static varible : " + staticVariable);
		
		//Access static method within main method
		staticMethod();

	}

}
