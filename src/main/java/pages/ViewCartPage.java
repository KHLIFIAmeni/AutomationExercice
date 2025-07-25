package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCartPage {
	private WebDriver driver;

	public ViewCartPage(WebDriver driver) {
		this.driver = driver;
	}
	 private By cartItems = By.xpath("//tr[contains(@id, 'product-')]");
	
	 public int numberOfCartItems() {
		 return driver.findElements(cartItems).size();
	 }

}
