package collectionAPI;

public class User {

	public static void main(String[] args) 
	{
		WebDriver dr=null;;
		String brower="Chrome";
		if(brower.equals("Chrome"))
		{		
		dr= new ChromeDriver();
		
		}else if(brower.equals("FF"))
		{
		dr= new FirefoxDriver();
		
		}
		
		dr.get();		
		dr.close();
		dr.fun2();
		dr.fun1();

	}

}
