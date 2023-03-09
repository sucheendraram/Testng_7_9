package com.testng.learning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethodExample {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	
	@Test
	public void testCase1() {
		try {
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(3000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testCase2() {
		try {
			driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
			Thread.sleep(3000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
