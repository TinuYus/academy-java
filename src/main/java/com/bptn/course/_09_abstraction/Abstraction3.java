package com.bptn.course._09_abstraction;

interface Operations{
	void draw();
	//default method has some implementation
	default int add(int a , int b) {
		return a + b;
	}
	
	//static method
	static double getRandomNumber() {
		return Math.random();
	}
}

//create a sub class that implements the operations interface
class Calculator implements Operations{
	//
	@Override
	public void draw() {
		System.out.println("Draw method implemented by Calculator class");
		
	}
	
}

public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2,3);
		
		System.out.println("The result is: " + result);
		
		System.out.println("The random number is: " + Operations.getRandomNumber());

	}

}

//major takeaways
//1. Interface cannot be instantiated
//2. Abstract methods in the interface is implemented by a subclass
//3. Interfaces supports multiple inheritance- a sub class can implement multiple interface
//4. Interface cannot have instance variables
//5. Interface cannot have constructors
//6. It can consist of constants