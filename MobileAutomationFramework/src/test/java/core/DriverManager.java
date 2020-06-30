package core;

import org.apache.log4j.Logger;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager extends BasePage{
	Logger log = Logger.getLogger("devpinoyLogger");
	private AndroidDriver<MobileElement> driver= null;
	

	public AndroidDriver<MobileElement> setDriver()
	{
	    driver =launchDriver();
	    log.debug("initiating driver");
		System.out.println("initiating driver");
		return driver;
		
	}
	public AndroidDriver<MobileElement> getDriver()
	{
		if(driver==null)
		{
			driver=(AndroidDriver<MobileElement>) launchDriver();
			return driver;
		}
		else
		{
			return driver;
		}
	}
	
	

}
