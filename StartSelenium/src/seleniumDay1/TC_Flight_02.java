package seleniumDay1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Flight_02 
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("@AfterClass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method2");
	}
	

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Anand2");
	}

	@Test
	@Parameters({"browser"})
	public void test3(String name)
	{
		System.out.println(name);
	}

}
