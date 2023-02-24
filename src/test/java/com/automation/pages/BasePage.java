package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.DriverUtils;

public abstract class BasePage {
	WebDriver driver = DriverUtils.getDriver();

	public BasePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
}
