$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Testcase1.feature");
formatter.feature({
  "name": "Automate Amazon mobile application using the Appium tool in real android device",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test001"
    }
  ]
});
formatter.scenario({
  "name": "Verify the login functionality with checkout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test001"
    }
  ]
});
formatter.step({
  "name": "user is on \"AmazonLogin\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_is_on_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies \"SignInButton\" on \"AmazonLogin\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_verifies_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"AlreadyACustomerSignIn\" button on \"AmazonLogin\" page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_click_on_button_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"EmailId\" in \"EmailId\" on \"AmazonLogin\" page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_enter_in_on_page(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"Continue\" button on \"AmazonLogin\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_click_on_button_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies \"Continue\" is \"Disable\" on \"AmazonLogin\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_verifies_is_on_page(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"password\" in \"password\" on \"AmazonLogin\" page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_enter_in_on_page(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"SignIn\" button on \"AmazonLogin\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_click_on_button_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"65-inch TV\" in \"GlobalSearch\" on \"AmazonHome\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.TestCase1Steps.user_enter_in_on_page(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});