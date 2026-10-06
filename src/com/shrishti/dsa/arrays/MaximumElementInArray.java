package com.shrishti.dsa.arrays;

import java.util.Arrays;

public class MaximumElementInArray {
	
	public int maximumElementInArray(int[] arr) {
		
		int max1 = Arrays.stream(arr).max().getAsInt();
		int max2 = Arrays.stream(arr).reduce((a,b) -> a > b ? a : b).getAsInt();
		
		System.out.println(max1+ " -> Using Stream");
		System.out.println(max2+ " -> Using Lambda functions");
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}

}
