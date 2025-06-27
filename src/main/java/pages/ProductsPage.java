package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	private WebDriver driver ;

	public ProductsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Selectors 
	private By allProductsText = By.xpath("//h2[text()='All Products']");
	private By productList = By.xpath("//div[@class='features_items']");
	private By firstProductBtn = By.xpath("(//a[text()='View Product'])[1]");
	private By searchProduct = By.id("search_product");
	private By searchButton = By.id("submit_search");
	private By productSearchedTxt = By.xpath("//h2[contains(.,'Searched Products')]");
	private By searchedItems = By.xpath("//div[@class='single-products']");
	//Functions
	 public boolean isVisibleAllProductsText() {
		 return driver.findElement(allProductsText).isDisplayed();
	 }
	 public boolean isVisibleProductList() {
		 return driver.findElement(productList).isDisplayed();
	 }
	 public void clickFirstProductBtn() {
		 driver.findElement(firstProductBtn).click();
	 }
	public void searchfunction(String searchValue) {
		driver.findElement(searchProduct).sendKeys(searchValue);
		driver.findElement(searchButton).click();
	}
	public boolean isVisibleProductSearch() {
		return driver.findElement(productSearchedTxt).isDisplayed();
	}
	public int countSearchedItems() {
		return driver.findElements(searchedItems).size();
	}

}
