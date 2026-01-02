package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParalletTest {
	
	
	@Test
	public void launchfb()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(Thread.currentThread().getId());
		
	}
	
	@Test
	public void launinsta()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	public void launchGit()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void launchGoogleDoc()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://workspace.google.com/intl/en_in/products/docs/");
		System.out.println(driver.getTitle());
		System.out.println(Thread.currentThread().getId());
		
	}

}
