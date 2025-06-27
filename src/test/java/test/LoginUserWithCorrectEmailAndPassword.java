package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginUserWithCorrectEmailAndPassword extends BaseTest {
	@Test
	public void loginTest() {
		
		
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "l'utilisateur n'est pas sur la page d'accueil");
		homePage.clickLoginSignupLink();
		
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isVisibleLoginText(), "Login title is not visible");
		loginPage.login("khlifitest@gmail.com", "123456789");
		
		AccountPage accountPage = new AccountPage(driver);
		Assert.assertTrue(accountPage.isVisibleLoggedinText(), "Logged In est invisible");
		accountPage.clickDeleteLink();
		
		DeleteAccountPage deleteAccountPage = new DeleteAccountPage(driver);
		Assert.assertTrue(deleteAccountPage.isVisibledeleteAcountText(), "Delete Account message invisible");
	}

}
