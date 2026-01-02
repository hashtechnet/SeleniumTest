package com.tests.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider(name="user&pwd", indices = {0,4}) //using indices we can only the desired data with indices 
	public Object[] userNamePass()
	{
		Object[] names = {"pankaj",1,"Tahseen",2,"shaheen",3};
		return names;
	}
	
	@DataProvider(name="admins") //using indices we can only the desired data with indices 
	public Object[] admins()
	{
		Object[] names = {"admin",1,"root",2,"lead",3};
		return names;
	}
}
