package stepDefinitions;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;

public class DriverManager extends BasePage {

	private AndroidDriver<MobileElement> driver = null;

	public AndroidDriver<MobileElement> setDriver() {
		driver = launchDriver();

		System.out.println("initiating driver");
		return driver;

	}

	public AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			driver = setDriver();
			return driver;
		} else {
			return driver;
		}
	}

}
