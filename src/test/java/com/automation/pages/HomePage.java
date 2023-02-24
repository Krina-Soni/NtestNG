package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(id = "header_container")
	WebElement homePageHeader;

	@FindBy(className = "product_sort_container")
	WebElement homePageFilter;

	@FindBy(className = "inventory_item_name")
	List<WebElement> itemName;

	@FindBy(className = "inventory_item_price")
	List<WebElement> itemPrice;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartBtn;

	@FindBy(className = "shopping_cart_link")
	WebElement cartIcon;
	
	@FindBy(xpath = "//div[@class='pricebar']/button[1]")
	WebElement cartbutton;
	
	@FindBy(xpath = "//div[@class='pricebar']/button[text()='Remove']")
	WebElement Removecartbutton;
	
	
	public List<WebElement> getItemNames() {
		return itemName;
	}
	
	public List<WebElement> getItemPrices() {
		return itemPrice;
	}

	public String getItemName() {
		String itemNameValue = itemName.get(0).getText();
		System.out.println("Item name on home page" + itemNameValue);
		return itemNameValue;
	}

	public String getItemPrice() {
		String itemPriceValue = itemPrice.get(0).getText();
		System.out.println("Item price on home page" + itemPriceValue);
		return itemPriceValue;
	}

	public void clickOnAddToCartBtn() {
		addToCartBtn.click();
	}

	public boolean isHomePageLoaded() {
		return homePageHeader.isDisplayed() && homePageFilter.isDisplayed();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}
	
	public void clickOnCartbutton() {
		cartbutton.click();
	}
	public boolean isRemoveitemVisible() {
		return Removecartbutton.isDisplayed();
	}
}
