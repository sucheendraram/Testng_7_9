package com.testng.learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTestExample {
	
	@Test
	public void testCase1() {
		System.out.println("Test case 1 executed");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2 executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method executed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Before method executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class executed");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test executed");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Executed");
	}
}
