package seleniumDay2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass2 
{
	
	@Test(dataProvider="getdata")
	public void login(String username, String password)
	{
		
		WebDriver dr= new ChromeDriver();		
		dr.get("http://newtours.demoaut.com");		
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
		dr.close();
		
	}
	
	@DataProvider
	public String[][] getdata() throws IOException
	{
		Xls_Reader xl= new Xls_Reader("D://TestData.xls");
		int row=xl.getrowcount("test1");
		int col=xl.getColumncount("test1");
		String[][] str= new String[row-1][col] ;
		
		for(int r=2; r<=row; r++)
		{
			for(int c=1; c<=col; c++)
			{
				str[r-2][c-1]=xl.getCellData("test1", r, c);
			}
		}			
		return str;
	}
	
	

}