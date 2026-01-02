package com.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndices {

	
	@Test(dataProvider="admins", dataProviderClass = DataProviderClass.class)
	public void test(Object username)
	{
		//for(String s : username)
		System.out.println("username-"+username);
		//System.out.println("username-"+password);
	}
	
}
