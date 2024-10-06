package com.bptn.course._08_polymorphism;

//Parent class
class Animal{
	
	void makesound() {
		System.out.println("Animal makes a sound");
	}
	
}

//Sub class
class Dog extends Animal{
	
	//has its own methods
	@Override
	void makesound() {
		System.out.println("barks");
		
	}
	
	//it can also have its own methods
	
	
}




public class Polymorphism1 {

	public static void main(String[] args) {
		// create an object of Animal class
		Animal a1 = new Animal();
		a1.makesound();
		
		//create an object from Dog class
		Dog d1 = new Dog();
		d1.makesound();

	}

}


//Major key takeaways
//Method Overriding
//1. Scenario- when the subclass decides to override an existing method in the parent class
//2. Name of the method, return type of the method and the number of parameters in the overridden method should be the same
//3. By convention  the overriden method has @override annotation above its method signature
//4. Static methods cannot be overridden
//5. Method overriding is also known as runtime polymorphism