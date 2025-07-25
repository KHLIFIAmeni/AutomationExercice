package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LogoutUser extends BaseTest {
	@Test
	public void logoutUser() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		Assert.assertTrue(homePage.isAtHomePage(), "The user is not on the home page");
		homePage.clickLoginSignupLink();
		
		
		Assert.assertTrue(loginPage.isVisibleLoginText(), "Login title is not visible");
		loginPage.login("chtouaiti@gmail.com", "123456789");
		Assert.assertTrue(homePage.isLoggedInTextVisible(), "Login in as text is not visible");
		homePage.clickLogoutLink();
		Assert.assertTrue(homePage.isAtHomePage(), "The user is not on the home page");
		
	}

}
