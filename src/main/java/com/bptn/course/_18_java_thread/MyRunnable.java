package com.bptn.course._18_java_thread;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Interrupted exception has occured: " + e.getMessage());
			}
		}
		
	}

	public static void main(String[] args) {
		//Create an object of MyRunnable (class that implements the runnable interface)
		MyRunnable myObj = new MyRunnable();
		// Create an object from the Thread class and pass the object created in step 2 into the constructor of the Thread class
		Thread thread = new Thread(myObj);
		//Start the thread using start
		thread.start();
	}

	

}

//Steps to create a thread using runnable interface
//1. Create a class that implements Runnable interface
//2. Create an object of MyRunnable (class that implements the runnable interface)
//3. Create an object from the Thread class and pass the object created in step 2 into the constructor of the Thread class
//4. Start the thread using start
//5. Sleep() is a static method
//Throws
//IllegalArguementException- if the value of millis is negative
//InterruptedException - If any thread has interrupted the current thread
//InteeruptedException is a checked exception and hence java wants you to deal with it by surrounding it with a try/catch
