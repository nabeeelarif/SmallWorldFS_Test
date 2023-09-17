package Steps;

import DriverFactory.DriverFactory;
import Pages.CartPage;
import io.cucumber.java.en.Then;

public class CartPageSteps {

	private CartPage cartpage = new CartPage(DriverFactory.driver);

	@Then("Sauce Labs Backpack should be there in the cart")
	public void sauce_labs_backpack_should_be_there_in_the_cart() {
	    cartpage.BackpackIsPresent();
	}
}
