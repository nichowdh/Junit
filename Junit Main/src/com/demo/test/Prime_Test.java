package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Prime_main;

public class Prime_Test {
	@Test
	public void test() {
		assertEquals(true, Prime_main.findprime(3));
//		assertEquals(false, Prime_main.findprime(3));
//		assertEquals(true, Prime_main.findprime(0));
//		assertEquals(true, Prime_main.findprime(2));
//		assertEquals(true, Prime_main.findprime(-1));

	}

}
