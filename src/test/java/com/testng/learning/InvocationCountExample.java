package com.testng.learning;

import org.testng.annotations.Test;

public class InvocationCountExample {
	@Test(invocationCount = 3)
	public void testCase1() {
		System.out.println("Testcase 1 executed");
	}

	@Test(invocationCount = 2)
	public void testCase2() {
		System.out.println("Testcase 2 executed");
	}

	@Test
	public void testCase3() {
		System.out.println("Testcase 3 executed");
	}

	@Test
	public void testCase4() {
		System.out.println("Testcase 4 executed");
	}
}
