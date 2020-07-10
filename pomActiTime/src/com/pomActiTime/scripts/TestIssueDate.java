package com.pomActiTime.scripts;

import java.io.IOException;

import com.pomActiTime.generics.FWUtilis;
import com.pomActiTime.pages.EnterTimeTrackPage;
import com.pomActiTime.pages.LicensePage;
import com.pomActiTime.pages.LoginPage;

public class TestIssueDate extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		openApplication("firefox");
		
		verifyPage(driver, LPTITLE);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLoginButton();
		Thread.sleep(1000);
		
		verifyPage(driver, ETTPTITLE);
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.clickSettings();
		etp.clickLicense();
		Thread.sleep(1000);
		
		verifyPage(driver, LICPTITLE);
		
		LicensePage lip = new LicensePage(driver);
		lip.getIssueDate();
		
		Thread.sleep(1000);
		takeScreenshot(driver, "./photo/1.jpg ");
		Thread.sleep(1000);
		
		closeApplication();
	}
	
}
