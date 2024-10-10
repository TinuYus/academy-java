package com.bptn.course._18_java_thread;

public class ThreadExample extends Thread {
	public ThreadExample(String name) {
		super(name);
	}
	
	@Override
	
	public void run() {
		
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create an object from ThreadExample
		ThreadExample t1 = new ThreadExample("Thread 1");
		
		ThreadExample t2 = new ThreadExample("Thread 2");
		
		System.out.println("State of the thread: " + t1.getState() + " " + t2.getState());
		
		//Start both the threads concurrently
		t1.start();
		t2.start();
		
		System.out.println("State of the thread: " + t1.getState() + " " + t2.getState());
		
		try {
			System.out.println("State of the thread: " + t1.getState() + " " + t2.getState());
			t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Executing the main thread");
		
		System.out.println("The name of the first thread: " + t1.getName());
		System.out.println("The name of the second thread: " + t2.getName());
		System.out.println("State of the thread: " + t1.getState() + " " + t2.getState());
		
		

	}

}
