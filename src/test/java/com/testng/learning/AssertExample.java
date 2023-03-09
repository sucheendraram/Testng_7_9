package com.testng.learning;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	@Test
	public void testCase1() {
		//Login
		Assert.fail();
		System.out.println("Testcase1 executed");
		
	}

	@Test(dependsOnMethods = "testCase1")
	public void testCase2() {
		//Inbox
		System.out.println("Testcase2 executed");
	}
}
