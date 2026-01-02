package com.tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTests {


	@Test(priority=4)
	public void logout()
	{
		System.out.println("Logged out");
	}
	
	///ignore the test with Ignore annotation
	@Ignore
	@Test(priority=1)
	public void launchWeb()
	{
		System.out.println("Webpage launched");
	}


	@Test(priority=2)
	public void Loging()
	{
		System.out.println("Logged in");
	}
	

	@Test(priority=3)
	public void performAction()
	{
		System.out.println("Action Performed");
	}
	
	//ignore the test with enable attribute
	@Test(priority=5, enabled=false)  
	public void enterCred()
	{
		System.out.println("Cread entered");
	}
	
}
