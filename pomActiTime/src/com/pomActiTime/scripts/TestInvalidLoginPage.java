package com.pomActiTime.scripts;

import com.pomActiTime.generics.FWUtilis;
import com.pomActiTime.pages.LoginPage;

public class TestInvalidLoginPage extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException 
	{
		openApplication("chrome");
		
		LoginPage lp = new LoginPage(driver);
		
		verifyPage(driver, LPTITLE);
		
		lp.setUsername("admin..");
		lp.setPassword("manageeer");
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.setUsername("admin");
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.setPassword("manager");
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		closeApplication();
		
	}
	
	
}
