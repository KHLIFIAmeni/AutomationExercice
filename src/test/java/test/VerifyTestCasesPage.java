package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.TestCasesPage;

public class VerifyTestCasesPage extends BaseTest {
	@Test
	public void verifyTestCasesPage() {
		HomePage homePage = new HomePage(driver);
		TestCasesPage testCasesPage = new TestCasesPage(driver);
		
		Assert.assertTrue(homePage.isAtHomePage(), "The user is not on the home page");
		homePage.clickTestCasesLink();
		Assert.assertTrue(testCasesPage.isTestCasesPageVisible(), "test cases page is not visible");
		
		
	}

}
