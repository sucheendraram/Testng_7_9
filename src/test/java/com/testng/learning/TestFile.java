package com.testng.learning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFile {

	@DataProvider(name = "test-data")
	public Object[][] dataProvFunc() {
		
		
		return new Object[][] { { "Lambda Test" }, { "Automation" } };
		
	}

	@Test(dataProvider = "test-data")
//	@Parameters({ "url", "firstName", "lastName" })
	public void testCase1(Object val) {
		
		System.out.println("Inside Test File");
		System.out.println("URL is " + val);
//		System.out.println("First Name is "+firstName);
//		System.out.println("Last Name is "/+lastName);
	}
}
