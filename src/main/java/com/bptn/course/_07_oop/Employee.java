package com.bptn.course._07_oop;

public class Employee {
	//Create Instance Variables
	private String name;
	private int employeeId;
	private int age;
	
	//Create a constructor
	
	//Default constructor
	//this keyword is used to to point to the current instance variable- if you have instance variable, local variable or parameter variable with exactly the same name
	public Employee() {
		this.name = "Qudrat";
		this.employeeId = 357626;
		this.age = 20;
		
	}
	
	//Parameterized constructor
	public Employee(String name , int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	//Parameterized constructor
	public Employee(String name , int employeeId , int age) {
		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
	}
	
	
	
	//create method
	public void printInfo() {
		System.out.println("Employee name: " + this.name + "Employee ID: " + this.employeeId + "Age: " + this.age);
	}
	
	
	public static void main(String[] args) {
		// Create objects from class
		Employee e1 = new Employee();
		e1.printInfo();
		
		Employee e2 = new Employee("Tinu ", 24);
		e2.printInfo();
		
		Employee e3 = new Employee("Tinu ", 5370 , 24);
		e3.printInfo();
		

	}

}
