package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;

	By cartItemBackpack = By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]");
	
	public CartPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public void BackpackIsPresent() {
		driver.findElement(cartItemBackpack).isDisplayed();
	}
}
