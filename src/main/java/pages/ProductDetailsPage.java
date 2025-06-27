package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
	private WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Locators
	private By productName =By.xpath("//div[@class='product-information']/h2");
	private By category = By.xpath("//p[contains(text(),'Category')]");
	private By price = By.xpath("//span[contains(text(),'Rs.')]");
	private By availability = By.xpath("//p[contains(.,'Availability')]");
	private By condition  = By.xpath("//p[contains(.,'Condition')]");
	private By brand = By.xpath("//p[contains(.,'Brand')]");
	
	//Functions
	public boolean inProductDetailsPage() {
		return driver.getCurrentUrl().contains("https://www.automationexercise.com/product_details/1");
	}
	 public boolean isVisibleName() {
		 return driver.findElement(productName).isDisplayed();
	 }
	 public boolean isVisibleCategory() {
		 return driver.findElement(category).isDisplayed();
	 }
	 public boolean isVisiblePrice() {
		 return driver.findElement(price).isDisplayed();
	 }
	 public boolean isVisibleAvailability() {
		 return driver.findElement(availability).isDisplayed();
	 }
	 public boolean isVisibleCondition() {
		 return driver.findElement(condition).isDisplayed();
	 }
	 public boolean isVisibleBrand() {
		 return driver.findElement(brand).isDisplayed();
	 }
	

}
