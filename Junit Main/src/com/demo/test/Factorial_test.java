package com.demo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.demo.main.Factorial_main;

public class Factorial_test {
	@Test
	public void fact() {

		assertTrue(Factorial_main.fact(6));
		assertEquals(720, Factorial_main.fact(6));
	}

}
