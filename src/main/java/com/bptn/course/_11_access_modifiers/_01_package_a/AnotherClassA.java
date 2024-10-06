package com.bptn.course._11_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		// Create an object from ClassA
		ClassA myobj = new ClassA();
		
		//No we cannot access private methods in another class
		//myobj.privateMethod();
		
		//No we cannot access private variable in another class
		//System.out.println("Accessing private variable: " + myobj.privateVar);
		
		//Yes we can access default method in another class
		myobj.defaultMethod();
		
		//Yes we can access default variable in another class
		System.out.println("Accessing default variable: " + myobj.defaultVar);
		
		//Yes we can access public method in another class
		myobj.publicMethod();
		
		//Yes we can access public variable in another class
		System.out.println("Accessing public variable: " + myobj.publicVar);
		
		//Yes we can access protected method in another class
		myobj.protectedMethod();
		
		//Yes we can access protected variable in another class
		System.out.println("Accessing protected variable: " + myobj.protectedVar);
		
	}

}
