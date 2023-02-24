package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout2 extends BasePage{

	@FindBy(xpath = "//div[@class='header_container']/div/span[text()='Checkout: Overview']")
	WebElement checkoutOverview;

	@FindBy(xpath = "//div[@class='header_container']/div/span[text()='Checkout: Complete!']")
	WebElement OrderComplete;

	@FindBy(id = "cancel")
	WebElement cancel;

	@FindBy(id = "finish")
	WebElement Finish;

	@FindBy(className = "inventory_item_name")
	List<WebElement> itemName;

	@FindBy(className = "inventory_item_price")
	List<WebElement> itemPrice;

	public boolean ischeckoutOverviewDisplayed() {
		return checkoutOverview.isDisplayed();
	}
	public boolean isOrderCompleteDisplayed() {
		System.out.println("Order Placed successfully");
		return OrderComplete.isDisplayed();

	}

	public List<WebElement> getItemNames() {
		return itemName;
	}

	public List<WebElement> getItemPrices() {
		return itemPrice;
	}

	public String getcheckoutItemName() {
		String itemNameValue = itemName.get(0).getText();
		System.out.println("Item name on Overview page" + itemNameValue);
		return itemNameValue;
	}

	public String getcheckoutItemPrice() {
		String itemPriceValue = itemPrice.get(0).getText();
		System.out.println("Item price on Overview page" + itemPriceValue);
		return itemPriceValue;
	}

	public void clickOnFinishbutton() {
		Finish.click();
	}

	public void clickOncancelbutton() {
		cancel.click();
	}
}
