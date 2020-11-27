package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class DeleteCustomerTest extends BaseClass{

	@Test
	public void deleteCustomer() throws InterruptedException
	{


		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();

		DeleteCustomerPage deletecust = new DeleteCustomerPage(driver);

		deletecust.clickDeleteCustomer();
		deletecust.enterCustomerId("66568");
		deletecust.clickSubmitBtn();
		deletecust.alert();
		
		Thread.sleep(3000);


	}
}
