package com.bptn.course._09_abstraction;

public class Abstraction2 {

//Abstraction using interface- Before Java 8
//Interface cannot be instantiated - cannot be used to create objects
interface ShapeInterface{
	void draw();
	
	double getArea(); 
  }

}

//to implement the abstract methods from the interface- we need to create a sub-class
class RectangleClass implements ShapeInterface{
	private double width;
	private double height;
	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
		
	}

	@Override
	public double getArea(double width, double height) {
		
		return this.width + this.height;
	}

	
}

	public static void main(String[] args) {
		// Create an object from rectangle class
		RectangleClass r1 = new RectangleClass();
		r1.draw();
		r1.getArea();
		

	}

}
