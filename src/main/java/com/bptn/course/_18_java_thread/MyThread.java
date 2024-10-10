package com.bptn.course._18_java_thread;

class A extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("Hello World");
		}
	}
	
}

class B extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("Hello Java!");
		}
	}
	
}

public class MyThread {

	public static void main(String[] args) {
		//Create an object of class A
		
		A myObj = new A();
		myObj.start();
		
		B myObj2 = new B();
		myObj2.start();
		
		System.out.println("Main Thread");

	}

}

//Major Takeaways
//1. Class A and B are running with the context of the main thread. Hence, it is not executed as separate a thread
//2. Class A and B are extending the Thread class
//3. Its not recommended to call the run method directly because it runs within the context of the main Thread
