#Author: pushkar_narayan@outlook.com
@Test001
Feature: Automate Amazon mobile application using the Appium tool in real android device

  Scenario: Verify the login functionality with checkout
    Given user is on "AmazonLogin" page
    Then user verifies "SignInButton" on "AmazonLogin" page
    When user click on "AlreadyACustomerSignIn" button on "AmazonLogin" page
    When user enter "EmailId" in "EmailId" on "AmazonLogin" page
    And user click on "Continue" button on "AmazonLogin" page
    Then user verifies "Continue" is "Disable" on "AmazonLogin" page
    When user enter "password" in "password" on "AmazonLogin" page
    And user click on "SignIn" button on "AmazonLogin" page
    And user enter "65-inch TV" in "GlobalSearch" on "AmazonHome" page
