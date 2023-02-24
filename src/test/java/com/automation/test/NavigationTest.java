package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

	@Test
	public void verifyItemLinkNavigation() {
		loginPage.openWebsite();
		loginPage.doLogin();
		Assert.assertTrue(homePage.isHomePageLoaded(), "Home page is not loaded");
		
		for (int i = 0; i < homePage.getItemNames().size(); i++) {
			String homePageItemName = homePage.getItemNames().get(i).getText();
			String homePageItemPrice = homePage.getItemPrices().get(i).getText();
			homePage.getItemNames().get(i).click();
			String pdpPagItemName = pdpPage.getItemName();
			String pdpPagItemPrice = pdpPage.getItemPrice();
			Assert.assertTrue(homePageItemName.equals(pdpPagItemName), "Homepage item name does not match with pdp page item name");
			Assert.assertTrue(homePageItemPrice.equals(pdpPagItemPrice), "Homepage item price does not match with pdp page item price");
			homePage.navigateBack();
		}
	}

}
