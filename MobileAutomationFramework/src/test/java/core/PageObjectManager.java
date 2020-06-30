package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
public class PageObjectManager{
	
	
	
	Properties prop = new Properties();
	
	public void loadLocator() throws IOException
	{
		File file = new File("src/test/resources/locators/locator.properties");
		FileInputStream Is = new FileInputStream(file);
		prop.load(Is);
		
	}
	public By getLocator(String name)
	{
		By by = null;
		
		try {
		    	loadLocator();
		    } catch (IOException e)
		      {
				    System.out.println("properties file not found");
					e.printStackTrace();
		      }
		String myProp =prop.getProperty(name).toString();
		
		String [] ar = myProp.split(";");
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		String c = ar[0];
		switch(c)
		{
		case "id":
		     by=By.id(ar[1]);
		     break;
		case "xpath":
		     by=By.xpath(ar[1]);
		     break;
		default:System.out.println("Please enter correct locator type as id or xpath");
		 break;
		}
		return by;
		
		
		
	}
	
}
