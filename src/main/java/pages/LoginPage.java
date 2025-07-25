package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// signup champs 
	private By signupText = By.xpath("//h2[normalize-space()='New User Signup!']");
	private By nameField = By.xpath("//input[@data-qa='signup-name']");
	private By emailField = By.xpath("//input[@data-qa='signup-email']");
	private By SignupButton = By.xpath("//button[@data-qa='signup-button']");
	
	// login champs
	private By loginText = By.xpath("//h2[normalize-space()='Login to your account']");
	private By loginEmail = By.xpath("//input[@data-qa='login-email']");
	private By loginPassword = By.xpath("//input[@data-qa='login-password']");
	private By loginButton = By.xpath("//button[@data-qa='login-button']");
	
	
	// Message erreur champ
	private By errorMessage = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
	
	// functions signup
	public void enterName(String name) {
		driver.findElement(nameField).sendKeys(name);
	}
	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	public void clickSignupButton() {
		driver.findElement(SignupButton).click();
	}
	public boolean isVisibleSignupText() {
		return driver.findElement(signupText).isDisplayed();
	}
	
	// Functions login 
	public void login(String loginEmailValue, String loginPasswordValue) {
		driver.findElement(loginEmail).sendKeys(loginEmailValue);
		driver.findElement(loginPassword).sendKeys(loginPasswordValue);
		driver.findElement(loginButton).click();
	}
	public boolean isVisibleLoginText() {
		return driver.findElement(loginText).isDisplayed();
	}
	public boolean isVisibleErrorMessage() {
		return driver.findElement(errorMessage).isDisplayed();
	}
}
