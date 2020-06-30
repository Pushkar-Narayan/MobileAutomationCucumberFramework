package utilities;



public interface UiActions {
	
	 
	  void enterText(String text,String locator);
	  void clickOnElement(String sLocator);
	  void sendEnter(String sLocator);
	  String readElementText(String sLocator);
	  String getTitle();
	  public boolean presenceOfElement(String sLocator);
	  public void enterTextAndPressEnter(String sText, String sLocator);
		public boolean isElementEnable(String sLocator);
	

}
