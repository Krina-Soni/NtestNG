package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

	@Test
	public void verifyUserCanAddItemIntoCart() {
		loginPage.openWebsite();
		loginPage.doLogin();

		Assert.assertTrue(homePage.isHomePageLoaded(), "Home page is not loaded");

		String itemName = homePage.getItemName();
		String itemPrice = homePage.getItemPrice();

		homePage.clickOnAddToCartBtn();
		homePage.clickOnCartIcon();

		Assert.assertTrue(cartPage.isCartPageDisplayed(), "Cart page is not loaded");
		Assert.assertTrue(cartPage.getItemName().equals(itemName), "Item name is not matching with home page");
		Assert.assertTrue(cartPage.getItemPrice().equals(itemPrice), "Item price is not matching with home page");
	}

}
