package com.inetbanking.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.BaseClass;

public class DeleteCustomerPage extends BaseClass {


	WebDriver ldriver;

	public DeleteCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='Delete Customer']")
	WebElement deleteCustomer;

	@FindBy(name = "cusid")
	WebElement customerId;

	@FindBy(name = "AccSubmit")
	WebElement submitBtn;

	public void clickDeleteCustomer() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", deleteCustomer);
	}

	public void enterCustomerId(String ID)
	{
		customerId.sendKeys(ID);
	}

	public void clickSubmitBtn()
	{
		submitBtn.click();
	}

	public void alert() 
	{
		Alert alt =driver.switchTo().alert();
		alt.accept();

	}
}
