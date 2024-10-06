package com.bptn.course._11_access_modifiers._02_package_b;

import com.bptn.course._11_access_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		ClassA myobj = new ClassA();
		
		//No we cannot access private methods in another class in a different package
		//myobj.privateMethod();
		
				
		//No we cannot access private variable in another class in a different package
		//System.out.println("Accessing private variable: " + myobj.privateVar);
		
		//No we cannot access default method in another class in a different package
		//myobj.defaultMethod();
				
		//No we cannot access default variable in another class in a different package
		//System.out.println("Accessing default variable: " + myobj.defaultVar);
		
		//Yes we can access public method in another class in a different package
		  myobj.publicMethod();
				
		//Yes we can access public variable in another class in a different package
		  System.out.println("Accessing public variable: " + myobj.publicVar);
		  
		//No we cannot access protected method in another class in a different package
		//myobj.protectedMethod();
			
		//No we cannot access protected variable in another class in a different package
		//System.out.println("Accessing protected variable: " + myobj.protectedVar);
		
		ClassB myobj1 = new ClassB(); //create an object of ClassB
		
		//Yes we can access protected method  through sub-class from a different package
		myobj1.protectedMethod();
		
		//Yes we can access protected variable  through sub-class from a different package
		System.out.println("Accessing protected variable: " + myobj1.protectedVar);
		
		//Major takeaways
		//1. We cannot  access the private variable and method within the same class.
		//2. default ----> package private.
		//3. We cannot  access the default variable and method within the same class.
		//4. We can  access the protected variable and method through a sub-class from a different package.
		//5.When we create a 
	}

}
