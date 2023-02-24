package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.CartPage;
import com.automation.pages.Checkout1;
import com.automation.pages.Checkout2;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductDetailPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

public class BaseTest {

	LoginPage loginPage;
	HomePage homePage;
	CartPage cartPage;
	ProductDetailPage pdpPage;
	Checkout1 chkout1;
	Checkout2 chkout2;

	@BeforeMethod
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.initDriver();
		loginPage = new LoginPage();
		homePage = new HomePage();
		cartPage = new CartPage();
		pdpPage = new ProductDetailPage();
		chkout1 = new Checkout1();
		chkout2 = new Checkout2();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.quitDriver();
	}

}
