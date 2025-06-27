package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductsPage;

public class SearchProduct extends BaseTest {
	@Test
	public void searchProduct() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "Home page is not visible");
		homePage.clickProductsLinks();
		
		ProductsPage productsPage = new ProductsPage(driver);
		Assert.assertTrue(productsPage.isVisibleAllProductsText(), "All Products Text is not visible");
		productsPage.searchfunction("tshirt");
		Assert.assertTrue(productsPage.isVisibleProductSearch(), "Products search text is not visible");
		int countResult = productsPage.countSearchedItems();
		Assert.assertTrue(countResult>0, "No products found matching the search.");
	}
}
