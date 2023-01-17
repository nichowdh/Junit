package com.demo.main;

import java.util.StringTokenizer;

public class Demo_main2 {
	public static int square(int a) {
		return a * a;
	}

	public static String revWord(String str) {
		StringBuilder r = new StringBuilder();
		StringTokenizer tkn = new StringTokenizer(str, " ");
		while (tkn.hasMoreTokens()) {
			StringBuilder r1 = new StringBuilder();
			r1.append(tkn.nextToken());
			r1.reverse();
			r.append(r1);
			r.append(" ");
		}
		return r.toString();
	}

}
