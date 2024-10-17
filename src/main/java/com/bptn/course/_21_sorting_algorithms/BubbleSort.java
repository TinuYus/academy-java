package com.bptn.course._21_sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
	
	static void bubbleSort(int array[]) {
		int size = array.length;
		
		//loop for every array element
		
		for(int i = 0; i<size-1; i++) {
			//loop for comparison
			for (int j =0; j<size-1; j++) {
				//if value on the right is less than value on the left, we swap
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] data = {5,9,7,-3,0,10,2};
		
		System.out.println("Before Sort: " + Arrays.toString(data));
		
		BubbleSort.bubbleSort(data);
		System.out.println();
		System.out.println("After Sort: " + Arrays.toString(data));
		
	}

}
