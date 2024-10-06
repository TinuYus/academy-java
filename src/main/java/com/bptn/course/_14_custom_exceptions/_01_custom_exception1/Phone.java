package com.bptn.course._14_custom_exceptions._01_custom_exception1;

public class Phone {
	//If you dont specify public or private it becomes default or protected
	//Declare instance variables -properties/attributes
	//weight, height, width, color
	private int weight;
	private int height;
	private int width;
	private String color;
	
	// Declare Constructor. It is used to create an object
	//Has the same name as the class (Phone)
	//Does not have any type
	//Default constructor - does not have any parameter passed i.e. the objects (Variables) does not have any value
	public Phone() {
		
		//default values
		weight = 150;
		height = 140;
		width = 70;
		color = "black";
		
	}
	
	//1st Parameterized constructor - which has parameter passed
	public Phone(int w, int h, int wi, String c) {	
		weight = w;
		height = h;
		width = wi;
		color = c;
		
	}
	
	//2nd Parameterized constructor - which has parameter passed
		public Phone(int w, int h, int wi) {
			weight = w;
			height = h;
			width = wi;
			
		}
	
	
	
	//declare instance methods- behavior / functionality
	public void makePhoneCall() {
		
		System.out.println("Make a phone call");
	}
	
	
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}
	
	
	
	
	public static void main(String[] args) {
		//Create an object of the Phone Class using default constructor
		Phone myobj1 = new Phone();
		System.out.println("Default Phone: " + "Weight: " +  myobj1.weight + " Height: " +myobj1.height + " Width: " + myobj1.weight + " color: " + myobj1.color );
		
		//Create an object of the Phone class using parameterized constructor
		Phone myobj2 = new Phone(200, 100, 50, "Red");
		System.out.println("Default Phone: " + "Weight: " +  myobj2.weight + " Height: " +myobj2.height + " Width: " + myobj2.weight + " color: " + myobj2.color );
	
		Phone myobj3 = new Phone(250,150,60);
		System.out.println("Default Phone: " + "Weight: " +  myobj3.weight + " Height: " +myobj3.height + " Width: " + myobj3.weight + " color: " + myobj3.color );
		
		//Accessing the instance method using the object name - objectName.instanceMethodName()
		myobj1.makePhoneCall();
		myobj1.sendTextMessage();
	}

}


//Instance variables  are always declared as private because we want to encapsulate this from being accessed from another class
//Instance methods are alwaysdeclared as public because we want it to be accessible
//We can have many parameterized constructors which can have the same name but different number of parameters
//We can only have 1 default constructor within a class
//If we do not have any cinstructors in the class- Java automatically creates a default constructor by setting default values