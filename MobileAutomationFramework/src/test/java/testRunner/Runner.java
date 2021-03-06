package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features",
glue= {"stepDefinitions"},
plugin= {"pretty","json:target/Report/cucumber.json","html:target/Report/cucumber-html"},
tags= { "@Test001" } 

)
public class Runner extends AbstractTestNGCucumberTests
{
//### For running scenarios in parallel in one feature file
//	@DataProvider(parallel= true)
//	public Object[][] scenarios()
//	{
//		
//		return super.scenarios();
//
//	}
	
	
}
