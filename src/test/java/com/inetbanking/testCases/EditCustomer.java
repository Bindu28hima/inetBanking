package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustemerPage;
import com.inetbanking.pageObjects.LoginPage;

public class EditCustomer extends BaseClass {

	@Test
	public void editCust() throws IOException, InterruptedException {


		EditCustemerPage editCustomer = new EditCustemerPage(driver);

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();

		editCustomer.clickEditCstmr();
		editCustomer.enterCustemerID("66568");
		editCustomer.sumbitBtn();
		
		Thread.sleep(6000);

		boolean res =driver.getPageSource().contains("Edit Customer");
	
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test Case Passed...");
		}
		else
		{
			logger.info("Test Case Failed...");
			captureScreen(driver, "editCustomer");
			Assert.assertTrue(false);
		}
		
	}
}
