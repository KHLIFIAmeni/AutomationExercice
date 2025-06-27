package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContactPage;
import pages.HomePage;

public class ContactUsForm extends BaseTest {
	
	@Test
	public void contactForm() {
		
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "L'utilisateur n'est pas sur la page d'accueil");
		homePage.clickContactLink();
		
		ContactPage contactPage = new ContactPage(driver);
		Assert.assertTrue(contactPage.isVisibleInTouchText(), "Get In touch is not visible");
		contactPage.contactForm("Ameni", "khlifiameni@gmail.com", "subject of message", "your message here ", "E:\\rapportpfe.pdf");
		contactPage.clickBtnAcceptAlert();
		Assert.assertTrue(contactPage.isVisibleSuccessMessage(), "Success Message is not visible");
		contactPage.clickHomebtn();
		Assert.assertTrue(homePage.isAtHomePage(), "L'utilisateur n'est pas sur la page d'accueil");
	}

}
