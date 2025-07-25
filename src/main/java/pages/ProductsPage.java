package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	private WebDriver driver ;
	private Actions actions;

	public ProductsPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.actions = new Actions(driver);
	}
	
	// Selectors 
	private By allProductsText = By.xpath("//h2[text()='All Products']");
	private By productList = By.xpath("//div[@class='features_items']");
	private By firstProductBtn = By.xpath("(//a[text()='View Product'])[1]");
	private By searchProduct = By.id("search_product");
	private By searchButton = By.id("submit_search");
	private By productSearchedTxt = By.xpath("//h2[contains(.,'Searched Products')]");
	private By searchedItems = By.xpath("//div[@class='single-products']");
	private By firstProduct =By.xpath("(//div[@class='product-overlay'])[1]");
	private By secondProduct = By.xpath("(//div[@class='product-overlay'])[2]");
	private By addCartFirstProduct = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
	private By addCartSecondProduct = By.xpath("(//a[contains(text(),'Add to cart')])[2]");
	private By continueShoppingBtn = By.xpath("//button[normalize-space()='Continue Shopping']");
	private By viewCartLink = By.xpath("//p[@class='text-center']//a");
	private By cartModal = By.id("cartModal");
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
	public void waitForCartModalToDisappear() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(cartModal));
	}
	public void forceHideCartModal() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("let modal = document.getElementById('cartModal'); if(modal){ modal.style.display='none'; }");
	}
	public void hoverAndClickFirstProduct() {
		forceHideCartModal();
		WebElement firstProductElement = driver.findElement(firstProduct);
		firstProductElement.getLocation();
		actions.moveToElement(firstProductElement).perform();
		 WebElement addButton = driver.findElement(addCartFirstProduct);
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
		    
		 addButton.click();
	}
	public void hoverAndClickSecondProduct() {
		forceHideCartModal();
		WebElement secondProductElement = driver.findElement(secondProduct);
		actions.moveToElement(secondProductElement).perform();
		WebElement addButton = driver.findElement(addCartSecondProduct);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
	}
	public void clickContinueShopping() {
		forceHideCartModal();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn));
	    continueBtn.click();
	    
	}
	public void clickViewCart() {
		forceHideCartModal();
		driver.findElement(viewCartLink).click();
	}

}
