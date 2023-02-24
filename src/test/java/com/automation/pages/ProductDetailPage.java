package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {
	
	@FindBy(xpath = "//div[@class='inventory_details_name large_size']")
	WebElement itemName;

	@FindBy(className = "inventory_details_price")
	WebElement itemPrice;

	public String getItemName() {
		return itemName.getText();
	}

	public String getItemPrice() {
		return itemPrice.getText();
	}
}
