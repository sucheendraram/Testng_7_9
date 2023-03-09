package com.testng.learning;

import org.testng.annotations.Test;

public class TestCasesWithZeroAsPriorityExample {
	@Test(priority = 3)
	public void testCase_a() {
		System.out.println("Test case a executed");
	}

	@Test(priority = 1)
	public void testCase_b() {
		System.out.println("Test case b executed");
	}

	@Test(priority = 5)
	public void testCase_c() {
		System.out.println("Test case c executed");
	}

	@Test(priority = 2)
	public void testCase_d() {
		System.out.println("Test case d executed");
	}

	@Test(priority = 0)
	public void testCase_e() {
		System.out.println("Test case e executed");
	}
}
