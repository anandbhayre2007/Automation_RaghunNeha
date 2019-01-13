package seleniumDay1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Flight_03 {

	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method3");
	}
	

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method3");
	}
	

	@Test
	@Parameters({"browser"})
	public void test3(String name)
	{
		System.out.println(name);
	}
}
