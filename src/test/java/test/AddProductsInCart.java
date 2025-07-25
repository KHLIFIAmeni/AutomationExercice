package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductsPage;
import pages.ViewCartPage;

public class AddProductsInCart extends BaseTest{
	@Test
	public void addProductsInCart() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "The user is not on the home page");
		homePage.clickProductsLinks();
		
		ProductsPage productsPage = new ProductsPage(driver);
	
		productsPage.hoverAndClickFirstProduct();
		
		productsPage.clickContinueShopping();
		productsPage.hoverAndClickSecondProduct();
		
		productsPage.clickViewCart();
		
		ViewCartPage viewCartPage = new ViewCartPage(driver);
		Assert.assertEquals(viewCartPage.numberOfCartItems(), 2,"2 produits doivent être dans le panier");
		
	}

}
