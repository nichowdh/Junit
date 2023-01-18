package com.demo.main;

public class Factorial_main {
	public static boolean fact(int n) {
		if (n == 0)
			return false;
		int f = 1;
		while (n != 0) {
			f = f * n;
			n--;
		}
		return true;

	}

//	public static int fact(int n) {
//
//		int f = 1;
//		while (n != 0) {
//			f = f * n;
//			n--;
//		}
//		return f;
//
//	}

}
