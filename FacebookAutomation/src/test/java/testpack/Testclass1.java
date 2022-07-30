package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass1 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
		
	@Test
	public void test()
	{
		System.out.println("test method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	


}
