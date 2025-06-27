package pages;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
	private WebDriver driver;

	public ContactPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By inTouchText = By.xpath("//h2[normalize-space()='Get In Touch']");
	private By inputName = By.name("name");
	private By inputEmail = By.name("email");
	private By inputSubject = By.name("subject");
	private By inputMessage = By.name("message");
	private By uploadFile = By.name("upload_file");
	private By submitBtn = By.name("submit");
	private By successMessage = By.xpath("//div[@class='status alert alert-success']");
	private By homeBtn = By.xpath("//span[normalize-space()='Home']");
	
	
	public boolean isVisibleInTouchText() {
		return driver.findElement(inTouchText).isDisplayed();
	}
	public void contactForm(String nameValue, String emailValue, String subjectValue, String messageValue, String pathFile) {
		driver.findElement(inputName).sendKeys(nameValue);
		driver.findElement(inputEmail).sendKeys(emailValue);
		driver.findElement(inputSubject).sendKeys(subjectValue);
		driver.findElement(inputMessage).sendKeys(messageValue);
		
		//upload file 
		File file = new File(pathFile);
		driver.findElement(uploadFile).sendKeys(file.getAbsolutePath());
		}
	public void clickBtnAcceptAlert() {
		driver.findElement(submitBtn).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public boolean isVisibleSuccessMessage() {
		return driver.findElement(successMessage).isDisplayed();
	}
	public void clickHomebtn() {
		driver.findElement(homeBtn).click();
	}

}
