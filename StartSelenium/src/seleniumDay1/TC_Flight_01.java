package seleniumDay1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Flight_01 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method1");
	}
	

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method1");
	}
	
	@Test
	@Parameters({"browser"})
	public void test1(String name)
	{
		System.out.println(name);
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("TC1 ");
	}
	
	
	
	
	
}
