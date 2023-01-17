package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.AVG_Main;

public class Avg_Test {
	@Test
	public void average() {

		assertEquals(4, AVG_Main.avg(new int[] { 1, 2, 3, 5, 7, 6 }, 6));

//		double avg2 = AVG_Main.avg(new double[] { 4 });
//		assertEquals(3, avg2, 0.01);
	}

}
