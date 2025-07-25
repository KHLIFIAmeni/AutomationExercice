package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
	private WebDriver driver;

	public AccountPage(WebDriver driver) {
	
		this.driver = driver;
	}
	private By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
	private By deleteLink =By.xpath("//a[normalize-space()='Delete Account']");
	
	public boolean isVisibleLoggedinText() {
		return driver.findElement(loggedInText).isDisplayed();
	}
	public void clickDeleteLink() {
		driver.findElement(deleteLink).click();
	}

}
