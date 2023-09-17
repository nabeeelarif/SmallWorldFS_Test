package Pages;




import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	By selectfilter = By.xpath("//select[@class='product_sort_container']");
	By inventoryList = By.xpath("//div[@class='inventory_list']");
	By ItemsByPrice = By.xpath("//div[@class='inventory_item_price']");
	By backpackAddToCart = By.id("add-to-cart-sauce-labs-backpack");
	By shoppingCartButton = By.id("shopping_cart_container");

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}
	public void filterIsDisplayed() {
		driver.findElement(selectfilter).isDisplayed();
	}
	public void selectFilter(String value) {
		Select filter = new Select(driver.findElement(selectfilter));
		filter.selectByVisibleText(value);
	}
	public List<String> getPriceOfItems() {
		List<String> ItemPrice =new ArrayList<String>();
		List<WebElement> itemPriceList = driver.findElements(ItemsByPrice);
		int len = itemPriceList.size();
		for (int i = 0; i < len; i++) {
			ItemPrice.add(itemPriceList.get(i).getText().replace("$", ""));
		}
		return ItemPrice;		
	}
	public float lowestItemPrice () {
		float lowest = Float.parseFloat(getPriceOfItems().get(0));
		for (int i = 0; i < getPriceOfItems().size(); i ++) {
			if (Float.parseFloat(getPriceOfItems().get(i)) < lowest) {
				lowest = Float.parseFloat(getPriceOfItems().get(i));
			}
		}
		return lowest;
	}
	public float highestItemPrice () {
		float highest = Float.parseFloat(getPriceOfItems().get(0));
		for (int i = 0; i < getPriceOfItems().size(); i ++) {
			if (Float.parseFloat(getPriceOfItems().get(i)) > highest) {
				highest = Float.parseFloat(getPriceOfItems().get(i));
			}
		}
		return highest;
	}
	public void addBackpackToCart() {
		driver.findElement(backpackAddToCart).click();
	}
	public void viewShoppingCart() {
		driver.findElement(shoppingCartButton).click();
	}

}
