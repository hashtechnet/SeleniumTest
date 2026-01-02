package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void launchfb()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Assertions
		
		//hard assertion
		String expectedTitle="Facebook-";
		String actualTitle=driver.getTitle();
		
		/*hard assertion
		Assert.assertEquals(expectedTitle,actualTitle,"title mismatched");
		driver.findElement(By.id("email")).sendKeys("abcd@gamil.com");
		*/;
		
		//soft assertion
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedTitle, actualTitle, "title mismatched");
		driver.findElement(By.id("email")).sendKeys("abcd@gamil.com");
		
		softAssert.assertAll();
		
		
	}
	

}
