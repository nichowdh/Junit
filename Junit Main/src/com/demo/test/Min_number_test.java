package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Min_Number_main;

public class Min_number_test {
	@Test // annotation specifies that method is the best method
	public void max() {
		assertEquals(1, Min_Number_main.findMin(new int[] { 1, 3, 4, 2, 8 }));
		assertEquals(-12, Min_Number_main.findMin(new int[] { -12, -1, -3, -4, -2 }));

	}

}
