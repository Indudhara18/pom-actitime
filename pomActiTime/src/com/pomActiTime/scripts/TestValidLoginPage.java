package com.pomActiTime.scripts;

import java.io.IOError;
import java.io.IOException;

import com.pomActiTime.generics.BaseTest;
import com.pomActiTime.generics.FWUtilis;
import com.pomActiTime.pages.LoginPage;

public class TestValidLoginPage extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException , IOException
	{
		openApplication("chrome");
		
		LoginPage lp = new LoginPage(driver);
		
		verifyPage(driver, LPTITLE);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLoginButton();
		Thread.sleep(2000);
		verifyPage(driver, ETTPTITLE);
		
		takeScreenshot(driver, "./photo/and.jpg");
		
		closeApplication();
		
	}
	
}
