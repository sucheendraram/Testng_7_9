package com.testng.learning;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsExample {

	@BeforeTest
	public void  beforeTest(){
		System.out.println("BEFORE TEST CALLED in groups example");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AFTER TEST CALLED in groups example");
	}
	@Test(groups="Inbox")
	public void testCase1() {
		System.out.println("Testcase1 executed");
	}
	
	@Test(groups="Inbox")
	public void testCase2() {
		System.out.println("Testcase2 executed");
	}
	
	@Test(groups="Login")
	public void testCase3() {
		System.out.println("Testcase3 executed");
	}
	
	@Test(groups="Inbox")
	public void testCase4() {
		System.out.println("Testcase4 executed");
	}
	
	@Test(groups="Inbox")
	public void testCase5() {
		System.out.println("Testcase5 executed");
	}
	@Test(groups="Login")
	public void testCase6() {
		System.out.println("Testcase6 executed");
	}
	@Test(groups="Login")
	public void testCase7() {
		System.out.println("Testcase7 executed");
	}
	@Test(groups="Login")
	public void testCase8() {
		System.out.println("Testcase8 executed");
	}
	@Test(groups="Inbox")
	public void testCase9() {
		System.out.println("Testcase9 executed");
	}
	@Test(groups="Inbox")
	public void testCase10() {
		System.out.println("Testcase10 executed");
	}
	
}
