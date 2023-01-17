package com.demo.main;

public class Min_Number_main {
	public static int findMin(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				arr[i] = min;
		}
		return min;
	}

}
