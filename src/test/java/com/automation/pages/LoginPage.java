package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class LoginPage extends BasePage {

	@FindBy(id = "user-name")
	WebElement userNameElement;

	@FindBy(id = "password")
	WebElement passwordElement;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	public void doLogin() {
		userNameElement.sendKeys("standard_user");
		passwordElement.sendKeys("secret_sauce");
		loginBtn.click();
	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("application.url"));
	}

}
