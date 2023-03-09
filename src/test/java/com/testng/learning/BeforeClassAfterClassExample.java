package com.testng.learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassAfterClassExample {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass Executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass Executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method executed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method executed");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Testcase1 executed");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Testcase2 executed");
	}
}
