package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(id = "checkout")
	WebElement checkoutBtn;

	@FindBy(className = "inventory_item_name")
	WebElement itemName;
	
	@FindBy(className = "inventory_item_price")
	WebElement itemPrice;
	
	@FindBy(xpath = "//div[@class='item_pricebar']/button[text()='Remove']")
	WebElement Removecartbutton;
	
//	@FindBy(xpath = "//div[@class='cart_list']/div[3]")
//	WebElement Cartitem;

	public boolean isCartPageDisplayed() {
		return checkoutBtn.isDisplayed();
	}
	
	public String getItemName() {
		return itemName.getText();
	}
	
	public String getItemPrice() {
		return itemPrice.getText();
	}
	
	public boolean isRemoveitemVisible() {
		return Removecartbutton.isDisplayed();
	}
	
//	public boolean clickonRemoveitem() {
//		
//		if(Cartitem.isDisplayed()){
//			System.out.println("Remove Item is not working");
//		}
//		else {
//			System.out.println("Remove Item is working");
//		}
//		return Cartitem.isDisplayed();
//	}
	public void clickOnCheckoutIcon() {
		checkoutBtn.click();
	}
}
