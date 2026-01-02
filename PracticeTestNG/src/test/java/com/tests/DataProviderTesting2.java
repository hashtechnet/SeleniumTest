package com.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting2 {

	
	@Test(dataProvider="user&pwd")
	public void test(Object username)
	{
		//for(String s : username)
		System.out.println("username-"+username);
		//System.out.println("username-"+password);
	}
	
	
	@DataProvider(name="user&pwd")
	public Object[] dataProviderMethod()
	{
		Object[] names = {"pankaj",1,"Tahseen",2,"shaheen",3};
		return names;
	}
}
