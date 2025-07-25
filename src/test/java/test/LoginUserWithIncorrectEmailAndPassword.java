package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginUserWithIncorrectEmailAndPassword extends BaseTest {
	@Test
	public void invalidLogin() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "L'utilisateur n'est pas sur la page d'accueil");
		homePage.clickLoginSignupLink();
		
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isVisibleLoginText(), "l'utilisateur n'est pas sur la page login");
		loginPage.login("testformation@gmail.com", "23654825");
		Assert.assertTrue(loginPage.isVisibleErrorMessage(), "Le message d'erreur n'est pas afficher");
		
	}
}
