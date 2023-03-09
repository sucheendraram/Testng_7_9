package com.testng.learning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters({ "url", "firstName", "lastName" })
	public void testCase1(String url, String firstName, String lastName) {
		System.out.println("Test case 1 executed");
		System.out.println("URL " + url);
		System.out.println("First Name " + firstName);
		System.out.println("Last Name " + lastName);
	}
}
