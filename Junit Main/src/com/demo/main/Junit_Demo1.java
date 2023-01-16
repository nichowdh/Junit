package com.demo.main;

public class Junit_Demo1 {
	public static int findMax(int[] arr) {
		int max = arr[0];
		// int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

}
