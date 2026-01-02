package com.tests;

import org.testng.annotations.Test;

public class Prioritization {
	
	@Test(priority=4)
	public void logout()
	{
		System.out.println("Logged out");
	}
	

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


}
