package utilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import core.ConfigLoader;
import core.PageObjectManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BrowserActions implements UiActions {

	AndroidDriver<MobileElement> driver = null;
	ConfigLoader cl = new ConfigLoader();
	WebDriverWait a = null;

	public BrowserActions(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		a = new WebDriverWait(driver, 7);

	}

	PageObjectManager pm = new PageObjectManager();

	@Override
	public void enterText(String sText, String sLocator, String sPageName) {
		a.until(ExpectedConditions.visibilityOfElementLocated(pm.getLocator(sLocator, sPageName)));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(pm.getLocator(sLocator, sPageName)).sendKeys(sText);

	}

	public void enterTextAndPressEnter(String sText, String sLocator, String sPageName) {
		a.until(ExpectedConditions.visibilityOfElementLocated(pm.getLocator(sLocator, sPageName)));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(pm.getLocator(sLocator, sPageName)).click();

		driver.findElement(pm.getLocator(sLocator, sPageName)).sendKeys(sText + "\n");

	}

	@Override
	public void clickOnElement(String sLocator, String sPageName) {

		a.until(ExpectedConditions.presenceOfElementLocated(pm.getLocator(sLocator, sPageName)));
		a.until(ExpectedConditions.elementToBeClickable(pm.getLocator(sLocator, sPageName)));
		if (presenceOfElement(sLocator, sPageName)) {
			driver.findElement(pm.getLocator(sLocator, sPageName)).click();
		} else {
			Assert.fail("element not displayed");
		}

	}

	@Override
	public void sendEnter(String sLocator, String sPageName) {

	}

	@Override
	public String readElementText(String sLocator, String sPageName) {

		a.until(ExpectedConditions.presenceOfElementLocated(pm.getLocator(sLocator, sPageName)));
		String sText = driver.findElement(pm.getLocator(sLocator, sPageName)).getText();

		return sText;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean presenceOfElement(String sLocator, String sPageName) {
		a.until(ExpectedConditions.presenceOfElementLocated(pm.getLocator(sLocator, sPageName)));
		driver.findElement(pm.getLocator(sLocator, sPageName)).isDisplayed();
		return true;

	}

	public boolean isElementEnable(String sLocator, String sPageName) {
		a.until(ExpectedConditions.invisibilityOfElementLocated(pm.getLocator(sLocator, sPageName)));

		return true;

	}

	public void pressKey(String sAction) {
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public void scrollAndPerformAction(String sAction, String visibleText, String sPagename) {
		MobileElement mve = driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
		switch (sAction.toLowerCase()) {
		case "click":
			mve.click();
			break;
		case "verify":
			String sExpectedItem = cl.getDataFromConfig(visibleText, "config");
			if (sExpectedItem == null || sExpectedItem == "") {
				sExpectedItem = visibleText;
			}
			String sActual = getValueFromUI(visibleText, sPagename);
			Assert.assertEquals(sActual, sExpectedItem, "Details not matching");

			break;

		default:
			break;
		}
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");

	}

	public String getValueFromUI(String sElement, String sPagename) {
		return driver.findElement(pm.getLocator(sElement, sPagename)).getText();
	}
}
