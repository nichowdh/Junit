package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.EvenOddMain;

public class EvenOddTest {
	@Test // annotation specifies that method is the best method
	public void max() {
		assertEquals(true, EvenOddMain.findEvenOdd(8));
		assertEquals(false, EvenOddMain.findEvenOdd(5));

	}

}
