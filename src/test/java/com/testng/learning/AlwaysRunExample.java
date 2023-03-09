package com.testng.learning;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {

	@Test
	public void testCase1() {
		//Login
		Assert.fail();
		System.out.println("Testcase1 executed");
	}

	@Test(dependsOnMethods = "testCase1", alwaysRun = true)
	public void testCase2() {
		//Inbox
		System.out.println("Testcase2 executed");
	}
}
