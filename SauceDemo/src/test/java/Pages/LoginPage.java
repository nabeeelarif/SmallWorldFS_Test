package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	By msg_error = By.xpath("//div[@class='error-message-container error']");

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);
	}
	public void click() {

		driver.findElement(btn_login).click();
	}
	public void verifyErrorMessageIsDisplayed() {

		driver.findElement(msg_error).isDisplayed();
	}
	public void verifyHomeScreen() {

		driver.findElement(By.id("react-burger-menu-btn")).isDisplayed();
	}
}
