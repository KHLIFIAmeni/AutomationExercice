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
	private By testCasesLink = By.xpath("//a[@href='/test_cases']");
	private By contactLink = By.xpath("//a[normalize-space()='Contact us']");
	private By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
	private By logoutLink = By.xpath("//a[@href='/logout']");
	private By subscribeText = By.xpath("//h2[normalize-space()='Subscription']");
	private By footer =By.id("footer");
	private By subscribeEmail =By.id("susbscribe_email");
	private By subscibeBtn = By.id("subscribe");
	private By subscribeMsg = By.id("success-subscribe");
	
	public boolean isAtHomePage() {
	    return driver.getCurrentUrl().contains("automationexercise.com");
	}
	
	public void clickLoginSignupLink() {
		driver.findElement(loginSignupLink).click();
	}
	public void clickProductsLinks() {
		 driver.findElement(productsLink).click();
	}
	public void clickTestCasesLink() {
		driver.findElement(testCasesLink).click();
	}
	public void clickCarteLink() {
		driver.findElement(carteLink).click();
	}
	public void clickContactLink() {
		driver.findElement(contactLink).click();
	}
	public boolean isLoggedInTextVisible() {
		return driver.findElement(loggedInText).isDisplayed();
	}
	public void clickLogoutLink() {
		driver.findElement(logoutLink).click();
	}
	public void scollToFooter() {
		 driver.findElement(footer).getLocation();
	}
	public boolean isSubscribeTextVisible() {
		return driver.findElement(subscribeText).isDisplayed();
	}
	public void sendSubscribeEmail(String email) {
		driver.findElement(subscribeEmail).sendKeys(email);
		driver.findElement(subscibeBtn).click();
	}
	public boolean isSbscribeMsgVisible() {
		return driver.findElement(subscribeMsg).isDisplayed();
	}

}
