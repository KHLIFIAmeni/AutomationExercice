package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By loginSignupLink = By.xpath("//a[contains(text(),'Signup / Login')]");
	private By productsLink = By.xpath("//a[@href='/products']");
	private By carteLink = By.xpath("//a[@href='/view_cart']");
	private By contactLink = By.xpath("//a[normalize-space()='Contact us']");
	
	public boolean isAtHomePage() {
	    return driver.getCurrentUrl().contains("automationexercise.com");
	}
	
	public void clickLoginSignupLink() {
		driver.findElement(loginSignupLink).click();
	}
	public void clickProductsLinks() {
		 driver.findElement(productsLink).click();
	}
	public void clickCarteLink() {
		driver.findElement(carteLink).click();
	}
	public void clickContactLink() {
		driver.findElement(contactLink).click();
	}

}
