package com.testng.learning;

import org.testng.annotations.Test;

public class EnabledExample {
	
	@Test
	public void testCase1() {
		//Login
		System.out.println("Testcase 1 executed");
	}
	@Test
	public void testCase2() {
		//inbox
		System.out.println("Testcase 2 executed");
	}
	@Test(enabled = false)
	public void testCase3() {
		//Forgot Password
		System.out.println("Testcase 3 executed");
	}
	@Test
	public void testCase4() {
		// Drafts		
		System.out.println("Testcase 4 executed");
	}
	@Test
	public void testCase5() {
		//Sent Items
		System.out.println("Testcase 5 executed");
	}
	@Test
	public void testCase6() {
		//Important
		System.out.println("Testcase 6 executed");
	}
}
