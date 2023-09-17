@add_product
Feature: Add product to cart

  Background: User is logged in and on home screen
    Given user is on login screen
    When user enters "standard_user" in username field
    And user enters "secret_sauce" in password field
    And user clicks on "click_button"

  Scenario: adding Sauce Lab Backpacks to cart
    Given user is on Home screen
    When user adds Sauce Labs Backpack to cart
    And views the cart
    Then Sauce Labs Backpack should be there in the cart
