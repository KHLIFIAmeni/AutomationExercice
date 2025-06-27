package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductsPage;

public class VerifyAllProductsandProductDetailPage extends BaseTest {
	@Test
	public void  VerifyAllProductspProductDetail() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "Home page is not visible");
		homePage.clickProductsLinks();
		
		ProductsPage productsPage = new ProductsPage(driver);
		Assert.assertTrue(productsPage.isVisibleAllProductsText(), "All Products Text is not visible");
		Assert.assertTrue(productsPage.isVisibleProductList(), "Product List Is not visible");
		productsPage.clickFirstProductBtn();
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		Assert.assertTrue(productDetailsPage.inProductDetailsPage(), "First Product Details Page is not visible");
		Assert.assertTrue(productDetailsPage.isVisibleName(), "Product Name is not visible");
		Assert.assertTrue(productDetailsPage.isVisiblePrice(), "Product Price is not visible");
		Assert.assertTrue(productDetailsPage.isVisibleCategory(), "Product Category is not visible");
		Assert.assertTrue(productDetailsPage.isVisibleCondition(), "Product Condition is not visible");
		Assert.assertTrue(productDetailsPage.isVisibleAvailability(), "Product Availability is not visible");
		Assert.assertTrue(productDetailsPage.isVisibleBrand(), "Product Brand is not visible");
	}

}
