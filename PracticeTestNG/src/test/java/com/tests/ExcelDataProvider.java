package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@DataProvider(name="getFromExcel")
	public String[][] excelDataProvider() throws IOException
	{
		
		File excelFile = new File("./src/test/resources/TestData.xlsx");
		//System.out.println(excelFile.exists());
		
		FileInputStream FLInputStream = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook= new XSSFWorkbook(FLInputStream);
		
		XSSFSheet excelSheet = workbook.getSheet("usernames");
		
		int rows = excelSheet.getPhysicalNumberOfRows();
		//System.out.println("Total No of Rows ->"+rows);
		int cols = excelSheet.getRow(0).getLastCellNum();
		
		String[][] users = new String[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				
				DataFormatter df = new DataFormatter();
				
				//printing the values from the excel
				//System.out.println(df.formatCellValue(excelSheet.getRow(i).getCell(j)));
				
				//we can also store the data into array
				users[i][j]=df.formatCellValue(excelSheet.getRow(i).getCell(j));
				}
			
		}
		//System.out.println(rows.getCell(0));
		workbook.close();
		FLInputStream.close();
		
		//Return the data
		
		return users;
		
		//print the data from array
		/*
		for(String[] usr : users)
		{
			System.out.println(Arrays.toString(usr));
		}
		*/
	}

}
