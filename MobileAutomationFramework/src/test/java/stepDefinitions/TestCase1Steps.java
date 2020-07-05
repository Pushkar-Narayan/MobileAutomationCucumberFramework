package stepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import core.ConfigLoader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserActions;
import utilities.UiActions;

public class TestCase1Steps {

	DriverManager dm = new DriverManager();
	UiActions ui = new BrowserActions(dm.getDriver());
	ConfigLoader cl = new ConfigLoader();

	@Given("user is on {string} page")
	public void user_is_on_page(String sLocator) {
		ui.presenceOfElement(sLocator, sLocator);
	}

	@Then("user verifies {string} on {string} page")
	public void user_verifies_on_page(String sLocator, String sPagename) {
		ui.presenceOfElement(sLocator, sPagename);
	}

	@When("user click on {string} button on {string} page")
	public void user_click_on_button_on_page(String sLocator, String sPagename) {
		ui.clickOnElement(sLocator, sPagename);
	}

	@Then("user verifies {string} is {string} on {string} page")
	public void user_verifies_is_on_page(String sLocator, String sEnable, String spagename) {
		Assert.assertTrue(ui.isElementEnable(sLocator, spagename));
	}

	@When("user enter {string} in {string} on {string} page")
	public void user_enter_in_on_page(String sData, String sLocator, String sPagename) {
		String sSearchItem = cl.getDataFromConfig(sData, "config");
		if (sSearchItem == null || sSearchItem == "") {
			sSearchItem = sData;
		}
		ui.enterTextAndPressEnter(sSearchItem, sLocator, sPagename);

	}

	@When("user press {string}")
	public void user_press(String sAction) {
		ui.pressKey(sAction);
	}

	// @When("user scroll {string} and click on {string}")
	// public void user_scroll_and_click_on(String sAction, String sItem) {
	// // Write code here that turns the phrase above into concrete actions
	// ui.scrollAndPerformAction(sAction,sItem);
	// }

	@Then("user scroll to {string} the {string} on {string} page")
	public void user_scroll_to_the_on_page(String sAction, String sItem, String sPagename) {
		ui.scrollAndPerformAction(sAction, sItem, sPagename);
	}

	@Then("user verify below information of Product on {string} page")
	public void user_verify_below_information_of_Product_on_page(String sPagename, DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		List<String> subData;
		for (int i = 0; i < data.size(); i++) {
			subData = data.get(i);
			String validationDesc = subData.get(0);
			String expextedValidationValue = subData.get(1);
			String sActualValue = ui.getValueFromUI(validationDesc, sPagename);
			System.out.println(subData.get(0));
			System.out.println(subData.get(1) + "" + sActualValue);
			Assert.assertEquals(sActualValue, expextedValidationValue);

		}

	}

}
