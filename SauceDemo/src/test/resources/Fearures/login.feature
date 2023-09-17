@login
Feature: Login Functionality

	@login_positive 
  Scenario Outline: login with valid credentials
    Given user is on login screen
    When user enters "<Username>" in username field
    And user enters "<Password>" in password field
    And user clicks on "click_button"
    Then user should get logged in successfully

    Examples: 
      | Username        | Password     |
      | standard_user   | secret_sauce |

	@login_negative
  Scenario Outline: login with a locked out user
    Given user is on login screen
    When user enters "<Username>" in username field
    And user enters "<Password>" in password field
    And user clicks on "click_button"
    Then login should fail and error should be displayed

    Examples: 
      | Username        | Password     |
      | locked_out_user | secret_sauce |
