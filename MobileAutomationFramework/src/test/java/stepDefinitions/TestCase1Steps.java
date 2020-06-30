package stepDefinitions;
import org.testng.Assert;
import core.DriverManager;
import core.ConfigLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserActions;
import utilities.UiActions;

public class TestCase1Steps {
	
	DriverManager dm = new DriverManager();
	UiActions ui = new BrowserActions(dm.getDriver());
	ConfigLoader cl= new ConfigLoader();
	
	@Given("user is on {string} page")
	public void user_is_on_page(String sLocator) {
		
		ui.presenceOfElement(sLocator);
	}
	@Then("user verifies {string}")
	public void user_verifies(String sLocator) {
		

	  ui.presenceOfElement(sLocator);
	}
	@When("user click on {string} button")
	public void user_click_on_button(String sLocator) {
	   ui.clickOnElement(sLocator);
	}

	@When("user enter {string}")
	public void user_enter(String sLocator) {
		String sData=cl.getDataFromConfig(sLocator);
		if(sData.length()==0)
		{
			sData=sLocator;
		}
	    ui.enterText(sData, sLocator);
	}
	@When("user search {string} in {string}")
	public void user_search_in(String sData, String sLocator) {
		String sSearchItem=cl.getDataFromConfig(sLocator);
		if(sSearchItem==null)
		{
			sSearchItem=sData;
		}
	    ui.enterTextAndPressEnter(sSearchItem, sLocator);
	}
	@Then("user verifies {string} is {string}")
	public void user_verifies_is(String sLocator, String sEnability) {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(ui.isElementEnable(sLocator));
	}


}
 

