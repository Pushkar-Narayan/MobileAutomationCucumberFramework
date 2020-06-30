#Author: pushkar_narayan@outlook.com

@Test001
Feature: Automate Amazon mobile application using the Appium tool in real android device


 
  Scenario: Verify the login functionality with checkout
    Given user is on "AmazonLogin" page 
    Then user verifies "SignInButton" 
    When user click on "AlreadyACustomerSignIn" button
    And user enter "EmailId"
    And user click on "Continue" button
    Then user verifies "Continue" is "Disable"
    When user enter "password"
    And user click on "SignIn" button
    And user search "65-inch TV" in "GlobalSearch"
   
    

  