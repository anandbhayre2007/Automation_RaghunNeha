package readPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream("D:\\03122018\\PropertiesFile\\src\\readPropertiesFile\\objectrepo.properties");
		
		Properties p= new Properties();
		
		p.load(file);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("login"));
		
		
	}

}
