package com.inetbanking.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.BaseClass;

public class EditCustemerPage extends BaseClass {

	WebDriver ldriver;

	public EditCustemerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement editcstmr;

	@FindBy(name="cusid")
	WebElement cstmrID;

	@FindBy(xpath="//input[@value=\"Submit\"]")
	WebElement submitBtn;

	public void clickEditCstmr() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", editcstmr);
	}

	public void enterCustemerID(String ID) {
		cstmrID.sendKeys(ID);
	}

	public void sumbitBtn() {
		submitBtn.click();
	}
}
