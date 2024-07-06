Feature: Checkout product
  Scenario: User checkout minimum 2 products
    Given User already in home page
    And User add to cart 2 produts
    And User click checkout button
    And User input Firstname, Lastname, and Zipcode
    When User click finish button
    Then User on finish payment page
