package com.bptn.course._18_java_thread._coding_310;

public class MyThread extends Thread {
    
    SynchronizedPrinter printer;
    
    // Create a constructor to initialize the above instance variable
    public MyThread(SynchronizedPrinter printer) {
		this.printer = printer;
	}
    // Override the run() method here to call printNumbers()
    @Override
	public void run() {
		this.printer.printNumbers();
	}
    
}