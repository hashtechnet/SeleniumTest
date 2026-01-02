package com.tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Depedency {
	
	//Depends on methods
	 /*
	@Test
    public void test1()
    {
		int a = 5/0;
    System.out.println("== This is smkoe test Method1");
    }

	@Test(dependsOnMethods= {"test1"})
    public void test2()
    {
    System.out.println("== This is smkoe test Method2");
    }
	
	@Test(dependsOnMethods= {"test1"}, alwaysRun = true)
    public void test3()
    {
    System.out.println("== This is smkoe test Method3");
    }
	
	
	
	@Test
	public void test4()
    {
		int k =7/0;
    System.out.println("== This is smkoe test Method4");
    }
	
	@Test(dependsOnMethods= {"test4"}, skipFailedInvocations = true)
	public void test5()
    {
    System.out.println("== This is smkoe test Method5");
    }
	*/
	
	//Depends on Groups
	
	@Test(groups= {"smoke"})
    public void test1()
    {
    System.out.println("== This is smkoe test Method1");
    }

	@Test(groups= {"smoke"})
    public void test2()
    {
		int x= 5/0;
    System.out.println("== This is smoke test Method2");
    }
	
	@Test(groups= {"smoke","sanity"})
    public void test3()
    {
    System.out.println("== This is smkoe and sanity test Method3");
    }
	
	@Test(groups= {"sanity"})
    public void test4()
    {
    System.out.println("== This is sanity test Method4");
    }
	
	@Test(groups= {"unit"})
    public void test5()
    {
    System.out.println("== This is unit test Method5");
    }
	
	@Test(dependsOnGroups = {"smoke"})
    public void test6()
    {
    System.out.println("== This is test Method6");
    }
	
	@Test(groups= {"adhok","sanity"})
    public void test7()
    {
    System.out.println("== This is adhok sanity test Method7");
    }
	@Test(groups= {"uat"})
    public void test8()
    {
    System.out.println("== This is uat test Method8");
    }
	
}
