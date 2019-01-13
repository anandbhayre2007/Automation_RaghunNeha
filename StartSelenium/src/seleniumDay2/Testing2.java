package seleniumDay2;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Testing2 {

	public static void main(String[] args) 
	{
		WebDriver dr= new ChromeDriver();	
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("http://newtours.demoaut.com");	
		System.out.println(new Date());
		try {
			FluentWait wait = new FluentWait<WebDriver>(dr)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
		
			
			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				 public WebElement apply(WebDriver driver) {
				 WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
				 String getTextOnPage = element.getText();
				 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
				 System.out.println(getTextOnPage);
				 return element;
				 }else{
				 System.out.println("FluentWait Failed");
				 return null;
				 }
				 }
				 });
			
		}catch(Exception e)
		{
			System.out.println(new Date());
			dr.close();
		}
	

	}

}
