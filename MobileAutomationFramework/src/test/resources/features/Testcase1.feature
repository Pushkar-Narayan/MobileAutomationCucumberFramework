#Author: pushkar_narayan@outlook.com
@Test001
Feature: Automate Amazon mobile application using the Appium tool in real android device

  Scenario Outline: Verify the login functionality with checkout
    Given user is on "AmazonLogin" page
    Then user verifies "SignInButton" on "AmazonLogin" page
    When user click on "AlreadyACustomerSignIn" button on "AmazonLogin" page
    And user enter "EmailId" in "EmailId" on "AmazonLogin" page
    And user click on "Continue" button on "AmazonLogin" page
    Then user verifies "Continue" is "Disable" on "AmazonLogin" page
    When user enter "password" in "password" on "AmazonLogin" page
    And user click on "SignIn" button on "AmazonLogin" page
    And user enter "65-inch TV" in "GlobalSearch" on "AmazonHome" page
    And user press "Enter"
    And user scroll to "click" the "Konka 65 inch 311 Series" on "ProductSearch" page
    Then user verify below information of Product on "ProductSearch" page
      | Name  | <Product> |
      | Price | <Price>   |
    When user scroll to "Verify" the "Description" on "ProductSearch" page
    And user scroll to "click" the "Add to Cart" on "ProductSearch" page
    And user click on "cartIcon" button on "ProductSearch" page
    Then user verify below information of Product on "Checkout" page
      | Name  | <Product> |
      | Price | <Price>   |

    Examples: 
      | Product                                                       | Price     |
      | Konka 65 inch 311 Series UDE65MP311AN Ultra HD Smart L.E.D TV | $1,085.00 |
      #| Konka 65 inch 311 Series UDE65MP311AN Ultra HD Smart L.E.D TV | $1,000.00 |
    
