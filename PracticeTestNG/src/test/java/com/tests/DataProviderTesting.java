package com.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {

	
	@Test(dataProvider="user&pwd")
	public void test(String useranme, String password)
	{
		System.out.println("username-"+useranme);
		System.out.println("username-"+password);
	}
	
	
	@DataProvider(name="user&pwd")
	public Object[][] dataProviderMethod()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="pankaj";
		data[0][1]="1234";
		data[1][0]="admin";
		data[1][1]="9876";
		
		return data;
	}
}
