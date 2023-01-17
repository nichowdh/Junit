package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.main.Demo_main2;

public class Demo_Test2 {
	@BeforeClass
	public static void beforecl() throws Exception {
		System.out.println("Before the  class will implement");
	}

	@Before
	public void before() throws Exception {
		System.out.println("Using before class");
	}

	@Test
	public void findSquare() {
		assertEquals(4, Demo_main2.square(2));
	}

	@Test
	public void reverse() {
		assertEquals("avaJ ", Demo_main2.revWord("Java"));
	}

	@After
	public void after() throws Exception {
		System.out.println("using after class");
	}

	@AfterClass
	public static void aftercl() throws Exception {
		System.out.println("After the class will implement");
	}

}
