package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasePage {
	
	public AndroidDriver<MobileElement> driver;

	
	public AndroidDriver<MobileElement> launchDriver()
	{
		ConfigLoader cl = new ConfigLoader();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.PLATFORM_NAME,cl.getDataFromConfig("PlatformName", "config"));
		dc.setCapability(CapabilityType.VERSION,cl.getDataFromConfig("Version", "config"));
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, cl.getDataFromConfig("DeviceName", "config"));
		dc.setCapability(MobileCapabilityType.UDID, cl.getDataFromConfig("UDID", "config"));
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/src/test/resources/app/Amazon_shopping.apk");
		
		dc.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
//		dc.setCapability("unicodeKeyboard", true);
//		dc.setCapability("resetKeyboard", true);
		URL url = null;
		
		try {
			   url = new URL("http://localhost:4723/wd/hub");
	
			   driver = new AndroidDriver<MobileElement>(url,dc);
			  
 
			   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


		    } 
		    catch (MalformedURLException e) 
		    {	
		       e.printStackTrace();
		    }
		
	
		System.out.println("driver initialize and app started");
	
		return driver;
		
	}
	
	public WebDriver closeDriver()
	{
		
		driver.close();
		
		return driver;
	}

}
