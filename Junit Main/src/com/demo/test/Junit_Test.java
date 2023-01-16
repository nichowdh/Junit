package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Junit_Demo1;

public class Junit_Test {
	@Test // annotation specifies that method is the best method
	public void max() {
		assertEquals(8, Junit_Demo1.findMax(new int[] { 1, 3, 4, 2, 8 }));
		assertEquals(-1, Junit_Demo1.findMax(new int[] { -12, -1, -3, -4, -2 }));

	}

}
