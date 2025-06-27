package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
	
	private WebDriver driver;

	public DeleteAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By deleteAccountText = By.xpath("//b[normalize-space()='Account Deleted!']");
	private By continueBtn = By.xpath("//a[normalize-space()='Continue']");
	
	public boolean isVisibledeleteAcountText() {
		return driver.findElement(deleteAccountText).isDisplayed();
	}
	
	public void clickContinueBtn() {
		driver.findElement(continueBtn).click();
	}

}
