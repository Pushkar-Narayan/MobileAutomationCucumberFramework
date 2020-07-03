package stepDefinitions;
import org.testng.Assert;

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
		ui.presenceOfElement(sLocator,sLocator);
	}

	@Then("user verifies {string} on {string} page")
	public void user_verifies_on_page(String sLocator, String sPagename) {
		 ui.presenceOfElement(sLocator,sPagename);
	}

	@When("user click on {string} button on {string} page")
	public void user_click_on_button_on_page(String sLocator, String sPagename) {
		 ui.clickOnElement(sLocator,sPagename);
	}


	@Then("user verifies {string} is {string} on {string} page")
	public void user_verifies_is_on_page(String sLocator, String sEnable, String spagename) {
		Assert.assertTrue(ui.isElementEnable(sLocator,spagename));
	}

	@When("user enter {string} in {string} on {string} page")
	public void user_enter_in_on_page(String sData, String sLocator, String sPagename) {
		String sSearchItem=cl.getDataFromConfig(sData,"config");
		if(sSearchItem==null || sSearchItem=="")
		{
			sSearchItem=sData;
		}
	    ui.enterTextAndPressEnter(sSearchItem, sLocator,sPagename);

	}


}
 

