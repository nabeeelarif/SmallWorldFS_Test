package Steps;


import DriverFactory.DriverFactory;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
		
	private HomePage homepage = new HomePage(DriverFactory.driver);
	
	@Given("user is on Home screen")
	public void user_is_on_home_screen() {
		homepage.filterIsDisplayed();
	}

	@When("user selects {string} filter")
	public void user_selects_filter(String string) {
		homepage.selectFilter(string);
	}

	@Then("item with lowest price should show first")
	public void item_with_lowest_price_should_show_first() {
		assert Float.parseFloat(homepage.getPriceOfItems().get(0)) == homepage.lowestItemPrice();	
	}
	
	@Then("item with highest price should show first")
	public void item_with_highest_price_should_show_first() {
		assert Float.parseFloat(homepage.getPriceOfItems().get(0)) == homepage.highestItemPrice();	
	}
	@When("user adds Sauce Labs Backpack to cart")
	public void user_adds_sauce_labs_backpack_to_cart() {
	    homepage.addBackpackToCart();
	}

	@When("views the cart")
	public void views_the_cart() {
	    homepage.viewShoppingCart();
	}	
}
	
	

