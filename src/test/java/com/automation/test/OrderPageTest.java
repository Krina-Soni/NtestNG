package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPageTest extends BaseTest {
	@Test
	public void verifyUserAddProducttocart() {
		loginPage.openWebsite();
		loginPage.doLogin();

		Assert.assertTrue(homePage.isHomePageLoaded(), "Home page is not loaded");

		String itemName = homePage.getItemName();
		String itemPrice = homePage.getItemPrice();

		homePage.clickOnAddToCartBtn();
		homePage.isRemoveitemVisible();
		homePage.clickOnCartIcon();

		Assert.assertTrue(cartPage.isCartPageDisplayed(), "Cart page is not loaded");
		Assert.assertTrue(cartPage.getItemName().equals(itemName), "Item name is not matching with home page");
		Assert.assertTrue(cartPage.getItemPrice().equals(itemPrice), "Item price is not matching with home page");

		cartPage.clickOnCheckoutIcon();
		Assert.assertTrue(chkout1.isContinueDisplayed(), "Checkout page is not loaded");
		chkout1.AddDetails("Krina", "soni", "FK28RE");

		String chkitemName = chkout2.getcheckoutItemName();
		String chkitemPrice = chkout2.getcheckoutItemPrice();
		Assert.assertTrue(chkout2.ischeckoutOverviewDisplayed(), "Checkout overviw page is not loaded");
		Assert.assertTrue(cartPage.getItemName().equals(chkitemName), "Item name is not matching with cart page");
		Assert.assertTrue(cartPage.getItemPrice().equals(chkitemPrice), "Item price is not matching with cart page");

		chkout2.clickOnFinishbutton();
		Assert.assertTrue(chkout2.isOrderCompleteDisplayed(), "Order is not Placed");
	}

	@Test
	public void CheckoutValidtion() throws InterruptedException {
		loginPage.openWebsite();
		loginPage.doLogin();

		Assert.assertTrue(homePage.isHomePageLoaded(), "Home page is not loaded");

		String itemName = homePage.getItemName();
		String itemPrice = homePage.getItemPrice();

		homePage.clickOnAddToCartBtn();
		homePage.isRemoveitemVisible();
		homePage.clickOnCartIcon();

		Assert.assertTrue(cartPage.isCartPageDisplayed(), "Cart page is not loaded");
		Assert.assertTrue(cartPage.getItemName().equals(itemName), "Item name is not matching with home page");
		Assert.assertTrue(cartPage.getItemPrice().equals(itemPrice), "Item price is not matching with home page");

		cartPage.clickOnCheckoutIcon();
		Assert.assertTrue(chkout1.isContinueDisplayed(), "Checkout page is not loaded");
		chkout1.AddDetails("", "soni", "FK28RE");
		chkout1.clickOnContinuebutton();
		chkout1.ValidateFields();

	}

}
