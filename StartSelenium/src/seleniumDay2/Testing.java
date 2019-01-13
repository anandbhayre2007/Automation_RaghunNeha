package seleniumDay2;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {

	public static void main(String[] args) 
	{for(int i=1; i<20; i++)
	{
		WebDriver dr= new ChromeDriver();	
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("http://newtours.demoaut.com");	
		System.out.println(new Date());
		try {
			WebDriverWait wait= new WebDriverWait(dr, 15);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.name("userame"))));
		}catch(Exception e)
		{
			System.out.println(new Date());
			dr.close();
			System.out.println("***********************************");
		}
	}
	}

}