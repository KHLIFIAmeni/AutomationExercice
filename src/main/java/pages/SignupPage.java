package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	private WebDriver driver;

	public SignupPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	private By titleMrs = By.id("id_gender2");
	private By Password = By.id("password");
	private By day = By.id("days");
	private By mounth = By.id("months");
	private By year = By.id("years");
	private By newsletter = By.id("newsletter");
	private By specialOffers = By.id("optin");
	private By firstName = By.id("first_name");
	private By lastName = By.id("last_name");
	private By company = By.id("company");
	private By address1 = By.id("address1");
	private By address2 = By.id("address2");
	private By country = By.id("country");
	private By state = By.id("state");
	private By city = By.id("city");
	private By zipCode = By.id("zipcode");
	private By mobileNumber = By.id("mobile_number");
	private By createAccount = By.xpath("//button[@data-qa = 'create-account']");
	
	public void createFullAccount(String pwd,String dayValue, String monthValue, String yearValue, String fNameValue, String lNameValue, String companyValue, String adr1, String adr2,String countryValue, String stateValue,String cityValue, String zipcodeValue, String phoneNumber) {
		driver.findElement(titleMrs).click();
		driver.findElement(Password).sendKeys(pwd);
		Select selectDay = new Select (driver.findElement(day));
		selectDay.selectByValue(dayValue);
		Select selectMounth = new Select (driver.findElement(mounth));
		selectMounth.selectByValue(monthValue);
		Select selectYear = new Select(driver.findElement(year));
		selectYear.selectByValue(yearValue);
		driver.findElement(newsletter).click();
		driver.findElement(specialOffers).click();
		driver.findElement(firstName).sendKeys(fNameValue);
		driver.findElement(lastName).sendKeys(lNameValue);
		driver.findElement(company).sendKeys(companyValue);
		driver.findElement(address1).sendKeys(adr1);
		driver.findElement(address2).sendKeys(adr2);
		Select selectCountry = new Select(driver.findElement(country));
		selectCountry.selectByValue(countryValue);
		driver.findElement(state).sendKeys(stateValue);
		driver.findElement(city).sendKeys(cityValue);
		driver.findElement(zipCode).sendKeys(zipcodeValue);
		driver.findElement(mobileNumber).sendKeys(phoneNumber);
		
		
	}
	public void CreateAccountClick() {
		driver.findElement(createAccount).click();
	}

}
