package com.bptn.course._21_sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSort(int[] array) {
		int size = array.length; 
		//outer loop for each index
		for(int i = 1; i<size;i++) {
			int key = array[i];
			int j = i-1;
			
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1;
				
			}
			array[j+1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] data = {5,9,7,-3,0,10,2};
		
		System.out.println("Before Sort: " + Arrays.toString(data));
		
		BubbleSort.bubbleSort(data);
		System.out.println();
		System.out.println("After Sort: " + Arrays.toString(data));

	}

}
