package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class VerifySubscriptionInHomePage extends BaseTest {
	@Test
	public void verifySubscription() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isAtHomePage(), "The user is not on the home page");
		
		homePage.scollToFooter();
		Assert.assertTrue(homePage.isSubscribeTextVisible(), "Subscribe text is not visible");
		homePage.sendSubscribeEmail("Khlifiameni@gmail.com");
		Assert.assertTrue(homePage.isSbscribeMsgVisible(), "Sbscribe Messsage is not visible");
	}

}
