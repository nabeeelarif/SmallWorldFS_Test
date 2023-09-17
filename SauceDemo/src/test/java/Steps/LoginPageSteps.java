package Steps;

import DriverFactory.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginPageSteps {
	
	private LoginPage login = new LoginPage(DriverFactory.driver);
	
	@Given("user is on login screen")
	public void user_is_on_login_screen() {
	}

	@When("user enters {string} in username field")
	public void user_enters_username(String username) {
		login.enterUsername(username);
	}
	@When("user enters {string} in password field")
	public void user_enters_password(String password) {
		login.enterPassword(password);
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
		login.click();
	}

	@Then("user should get logged in successfully")
	public void user_should_get_logged_in_successfully() {
		login.verifyHomeScreen();
		
	}
	
	@Then("login should fail and error should be displayed")
	public void login_should_fail_and_error_should_be_displayed() {
		login.verifyErrorMessageIsDisplayed();
	}
	
}
