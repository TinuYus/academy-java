package com.bptn.course._22_generics;

public class GenericsDemo {
	
public static <T extends Comparable<T>>T findMaxGeneric(T num1, T num2) {
	
	System.out.println("You provided the following data: " + num1 + num2);
		
		//if(num1.compareTo(num2)){
		//what if true
		//}else{
		//what if else
		//}
		//condition. what if true? : what if false
		
		return(num1>num2)?num1:num2;
			
		}
	
	
	//Find maximum between two numbers
	public static int findMax(int num1, int num2) {
		
		//if(condition){
		//what if true
		//}else{
		//what if else
		//}
		//condition. what if true? : what if false
		
		return(num1>num2)?num1:num2;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Max of 10 and 20: " + findMax(10,20));
		findMaxGeneric(10,20);
		findMaxGeneric(10.6, 20.8);
		findMaxGeneric("Hi", "Hello");
		

	}

}
