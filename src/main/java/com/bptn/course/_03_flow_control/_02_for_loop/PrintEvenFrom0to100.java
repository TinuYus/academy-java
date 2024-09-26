package com.bptn.course._03_flow_control._02_for_loop;

public class PrintEvenFrom0to100 {

	public static void main(String[] args) {
		//Approach 1
		for(int i =2; i<=100; i+=2) {
			System.out.println(i);
		}
		
		//Approach 2
		for(int i=1; i<=100; i++) {
			System.out.println("The even numbered indexes are: " +i);
		}
	}

}
