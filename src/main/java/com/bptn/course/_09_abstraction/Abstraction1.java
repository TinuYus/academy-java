package com.bptn.course._09_abstraction;
//Abstraction using abstract class

//Abstraction class- its a class that cannot be instantiated- it cannot be used to create an object

abstract class Shape {
	// Abstract method--> a method with no implementation
	abstract void draw();

	abstract void print();

	// normal method which has an implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}
}

//create a sub class (child class) extends the shape class
class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a circle");

	}

	@Override
	void print() {
		System.out.println("Print a Circle");

	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a Rectangle");

	}

	@Override
	void print() {
		System.out.println("Print a Rectangle");
	}
}
	public class Abstraction1 {

		public static void main(String[] args) {
			// Create new objects from Circle class
			Circle c1 = new Circle();
			c1.draw();
			c1.print();
			c1.moveTo(2, 3); // This is an inherited method from shape class

			Rectangle r1 = new Rectangle();
			r1.draw();
			r1.print();
			r1.moveTo(5, 6);
		}

	}


//Major takeaways
//1. Abstract class- its a class that cannot be instantiated- it cannot be used to create objects
//2. It consists of both abstract and normal methods
//. The subclass is going to implement the abstract methods from abstract class
//4. when a sub class implements  the abstract methods from the abstract class it should follow the rules overriding
