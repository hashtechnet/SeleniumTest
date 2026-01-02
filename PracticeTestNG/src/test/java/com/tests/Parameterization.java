package com.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
		@Parameters("email")
	 	@Test
	    public void test1(String email)
	    {
	    System.out.println("== This is test Method1 =="+" "+email);
	    }
	    
		@Parameters("pwd")
	    @Test
	    public void test2(String pwd)
	    {
	    System.out.println("== This is test Method2 =="+" "+pwd);
	    }
		
		//optional parameter
		@Parameters("role")
	    @Test
	    public void test3(@Optional("admin") String role)
	    {
	    System.out.println("== This is test Method2 =="+" "+role);
	    }

}
