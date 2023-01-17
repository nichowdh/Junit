package com.demo.main;

public class Prime_main {
	public static boolean findprime(int num) {
		if (num < 2)
			return false;
		else {
			int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0)
					count = 1;
			}
			if (count == 0) {
				System.out.println("Yes " + num + " is Prime");
				return true;
			} else
				return false;
		}
	}

}
