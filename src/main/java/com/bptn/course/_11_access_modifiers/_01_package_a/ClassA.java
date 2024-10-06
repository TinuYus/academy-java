package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {

	// Declare a private variable
	private int privateVar;

	// Declare a public variable
	public int publicVar;

	// Declare a default variable
	int defaultVar;

	// Declare a protected variable
	protected int protectedVar;

	// Declare a private method
	private void privateMethod() {
		System.out.println("This is a private method.");
	}

	// Declare a public method
	public void publicMethod() {
		System.out.println("This is a public method.");
	}

	// Declare a default method
	void defaultMethod( ) {
		System.out.println("This is a default method.");
	}
	
	//Declare a protected method
	protected void protectedMethod() {
		System.out.println("This is a private method.");
	}
	

	public static void main(String[] args) {
		// Create an object of ClassA
		ClassA myobj = new ClassA();
		myobj.privateMethod();
		
		System.out.println("Accessing private method: " + myobj.privateVar);
		
		myobj.defaultMethod();
		
		System.out.println("Accessing default method:" + myobj.defaultVar);
		
		myobj.protectedMethod();
		
		System.out.println("Accessing protected method:" + myobj.protectedVar);	
		
		myobj.publicMethod();
		
		System.out.println("Accessing default method:" + myobj.publicVar);
		

	}

}

//Major takeaways
//1. We can  access the private variable and method within the same class.
//2. We can access the public variable and method within the same class.
//3. We can  access the default variable and method within the same class.
//4. We can  access the protected variable and method within the same class.
