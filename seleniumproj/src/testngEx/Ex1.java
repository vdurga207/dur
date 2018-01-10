package testngEx;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex1
{
	@BeforeClass 
	public void method1()
	{
		System.out.println("method1");
}
	@AfterClass 
	public void method2()
	{
		System.out.println("method2");
	}
	@Test//(priority=2)
	public void method3()
	{
		System.out.println("method3");
		Reporter.log("Test method1");
	}
	@Test//(priority=1)
	public void method4()
	{
		System.out.println("method4");
		Reporter.log("Test method2");
	}
	
}
