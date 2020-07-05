package utilities;

public interface UiActions {

	void enterText(String text, String locator, String sPageName);

	void clickOnElement(String sLocator, String sPageName);

	void sendEnter(String sLocator, String sPageName);

	String readElementText(String sLocator, String sPageName);

	String getTitle();

	public boolean presenceOfElement(String sLocator, String sPageName);

	public void enterTextAndPressEnter(String sText, String sLocator, String sPageName);

	public boolean isElementEnable(String sLocator, String sPageName);

	public void pressKey(String sAction);
	public void scrollAndPerformAction(String sAction,String visibleText,String sPagename);

	public String getValueFromUI(String sElement, String sPagename);

}
