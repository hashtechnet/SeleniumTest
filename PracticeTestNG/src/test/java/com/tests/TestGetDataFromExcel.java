package com.tests;

import org.testng.annotations.Test;

public class TestGetDataFromExcel {
	
	@Test(dataProvider = "getFromExcel", dataProviderClass = ExcelDataProvider.class)
	public void getDataFromExcelDataProvider(String name, String pwd)
	{
		System.out.println("Name->"+name);
		System.out.println("password->"+pwd);
		System.out.println();
		
	}

}
