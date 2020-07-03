package core;


import org.openqa.selenium.By;
public class PageObjectManager{
	
	
	ConfigLoader cl = new ConfigLoader();
	
	public By getLocator(String name,String sPageName)
	{
		By by = null;
		String myProp=	cl.getDataFromConfig(name, sPageName);
		
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
