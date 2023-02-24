package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLoginSuccessful() {
		loginPage.openWebsite();
		loginPage.doLogin();
		Assert.assertTrue(homePage.isHomePageLoaded(), "Home page is not loaded");
	}

}
