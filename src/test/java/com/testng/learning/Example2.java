package com.testng.learning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example2 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method called");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method called");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Test case 1 called");
		
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2 called");
	}
	
	

}
