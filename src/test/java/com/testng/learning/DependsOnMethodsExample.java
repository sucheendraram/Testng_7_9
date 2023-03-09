package com.testng.learning;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
	@Test
	public void testCase1() {
		try {
			//Login
			Thread.sleep(5000);
			System.out.println("Test case 1 executed");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test(priority = -1, dependsOnMethods = "testCase1")
	public void testCase2() {
		//Inbox		
		System.out.println("Test case 2 executed");
	}
}
