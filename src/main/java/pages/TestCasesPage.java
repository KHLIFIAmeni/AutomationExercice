package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage {
	private WebDriver driver;

	public TestCasesPage(WebDriver driver) {
		
		this.driver = driver;
	}
	 private By testCasesTitle = By.xpath("//b[normalize-space()='Test Cases']");

	    public boolean isTestCasesPageVisible() {
	        return driver.findElement(testCasesTitle).isDisplayed();
	    }
	

}
