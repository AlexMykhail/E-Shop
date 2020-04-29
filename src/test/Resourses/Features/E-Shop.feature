Feature: AutomationPractice

  Testing this feature, User got full process of navigation,
  randomly choosing/buying women's cloth, proceeding to check-out with
  info verification of payment through the site.

  Background:
    Given User clicks Sign in button
    And logins using credentials
      |LOGIN_EMAIL           |LOGIN_PASSWORD|
      |test@test123456789.com|123456        |



  Scenario: AutomationPractice Test
    When User clicks women category button
    And randomly chooses product
    And clicks Proceed to checkout button
    And clicks Proceed to checkout button to Address Page
    And clicks Proceed to checkout button to Shipping Page after Address Assertion
    And submits agreement, Proceed to checkout button to to Payment Page
    And clicks Pay By Check button
    And clicks I confirm my order button
    Then gets success message "Your order on My Store is complete."
    And clicks Back to orders
    When verifies order price is correct
    Then clicks Back to your account