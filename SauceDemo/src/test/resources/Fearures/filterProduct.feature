@filter_product
Feature: filter functionality.

  Background: User is logged in and on home screen
    Given user is on login screen
    When user enters "standard_user" in username field
    And user enters "secret_sauce" in password field
    And user clicks on "click_button"

  Scenario: Filtering product by price (low to high)
    Given user is on Home screen
    When user selects "Price (low to high)" filter
    Then item with lowest price should show first

  Scenario: Filtering product by price (high to low)
    Given user is on Home screen
    When user selects "Price (high to low)" filter
    Then item with highest price should show first
