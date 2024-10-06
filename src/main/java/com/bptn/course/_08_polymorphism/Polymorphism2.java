package com.bptn.course._08_polymorphism;

//parent class
class Shape {
	
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
}

//sub class rectangle
class Rectangle extends Shape{
	@Override
	void drawAngle() {
		System.out.println("Drawing a Rectangle");
	}
	
}

public class Polymorphism2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//1. create a parent class called shape
//2. create one subclass named rectangle
//3. Create method called drawAngle in the shape class and override it with the rectanger class