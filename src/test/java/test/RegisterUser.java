package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class RegisterUser extends BaseTest {
	@Test
	public void createAccount() {
		
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "l'utilisateur n'est pas sur la page d'accueil");
		homePage.clickLoginSignupLink();
		 // Vérifie "New User Signup!"
		String signupText = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).getText();
        Assert.assertEquals(signupText, "New User Signup!");
		System.out.println(signupText);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterName("Test");
		loginPage.enterEmail("rourouetinin@gmail.com");
		loginPage.clickSignupButton();
		
		SignupPage signupPage = new SignupPage(driver);
		signupPage.createFullAccount("123456789", "1", "1", "1990", "Khlifi", "Ameni", "Horus", "Bardo", "Tunis", "India", "mlkj", "58765", "ppppp", "21536485");
		signupPage.CreateAccountClick();
		// Vérifie "ACCOUNT CREATED!"
		String accountCreated = driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).getText();
        Assert.assertEquals(accountCreated, "ACCOUNT CREATED!");
        System.out.println(accountCreated);

        // Clique sur Continue
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        // Vérifie "Logged in as TestUser"
        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.isVisibleLoggedinText(), "logged in text est invisible");
        // Supprime le compte
        accountPage.clickDeleteLink();

        // Vérifie "ACCOUNT DELETED!"
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(driver);
        Assert.assertEquals(deleteAccountPage.isVisibledeleteAcountText(), "Delete account msg invisible");
        deleteAccountPage.clickContinueBtn();
        System.out.println("Tests passed");
    }

		
	}


