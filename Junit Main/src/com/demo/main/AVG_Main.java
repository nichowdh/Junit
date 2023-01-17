package com.demo.main;

public class AVG_Main {
	public static int avg(int[] first, int m1) {
		int sum = first[0];
		m1 = first.length;
		for (int i = 0; i < m1; i++)
			sum += first[i];
		return sum / m1;

		// double sum = 0;
//
//	        // sum all values
//	        for(double num : avg) {
//	            sum += num;
//	        }
//
//
//	        return sum / avg.length;
	}

}
