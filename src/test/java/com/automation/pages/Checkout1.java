package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Checkout1 extends BasePage {

	@FindBy(id = "cancel")
	WebElement cancelBtn;

	@FindBy(id = "continue")
	WebElement continueBtn;

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(xpath = "//h3[text()='Error: First Name is required']")
	WebElement first_error;

	@FindBy(xpath = "//h3[text()='Error: Last Name is required']")
	WebElement last_error;

	@FindBy(xpath = "//h3[text()='Error: Postal Code is required']")
	WebElement postalcode_error;
	String text;
	String text1;
	String text2;

	public boolean isCancelDisplayed() {
		return cancelBtn.isDisplayed();
	}

	public boolean isContinueDisplayed() {
		return continueBtn.isDisplayed();
	}

	public void AddDetails(String fname, String Lname, String Pcode) {
		try {
			if (firstname.isDisplayed()) {
				firstname.clear();
				firstname.sendKeys(fname);
				System.out.println("Succesfully entered '" + fname + "' in object");

			} else {
				System.out.println("Unable to find object");

			}

			if (lastname.isDisplayed()) {
				lastname.clear();
				lastname.sendKeys(Lname);
				System.out.println("Succesfully entered '" + Lname + "' in object");

			} else {
				System.out.println("Unable to find object");

			}
			if (postalCode.isDisplayed()) {
				postalCode.clear();
				postalCode.sendKeys(Pcode);
				System.out.println("Succesfully entered '" + Pcode + "' in object");

			} else {
				System.out.println("Unable to find object");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());}
		}



	public void ValidateFields() {
		String text = firstname.getAttribute("value");
		String text1 = lastname.getAttribute("value");
		String text2 = postalCode.getAttribute("value");

		System.out.println("Please Enter Valid First name data before checkout");
		System.out.println("Please Enter Valid First name data before checkout");

		if (text.isEmpty()) {
			Assert.assertEquals("Error: First Name is required", first_error.getText());
			System.out.println("Please Enter Valid First name data before checkout");

		}
		if (text1.isEmpty()) {
			Assert.assertEquals("Error: Last Name is required", last_error.getText());
			System.out.println("Please Enter Valid Last name data before checkout" + last_error.getText());

		}
		if (text2.isEmpty()) {
			Assert.assertEquals("Error: Postal Code is required", postalcode_error.getText());
			System.out.println("Please Enter Valid Postal Code data before checkout" + postalcode_error.getText());
		}

	}

	public void clickOnContinuebutton() {
		continueBtn.click();
	}
}
