package com.testng.learning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersExample {

	@DataProvider(name = "data-provider")
	public Object[][] dataProviderFunc() {
		return new Object[][] { { "Sucheendra"}, {"Ramesh" }, { "Kiran"}, {"Kumar" }  };
	}

	@Test(dataProvider = "data-provider")
	public void testCase1(Object value) {
		System.out.println("VALUE "+value);
	}
}
