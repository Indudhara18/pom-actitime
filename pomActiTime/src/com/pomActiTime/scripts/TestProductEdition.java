package com.pomActiTime.scripts;

import com.pomActiTime.generics.FWUtilis;
import com.pomActiTime.pages.EnterTimeTrackPage;
import com.pomActiTime.pages.LicensePage;
import com.pomActiTime.pages.LoginPage;

public class TestProductEdition extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		openApplication("ff");
		
		LoginPage lp = new LoginPage(driver);
		
		verifyPage(driver, LPTITLE);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLoginButton();
		Thread.sleep(1000);
		verifyPage(driver, ETTPTITLE);
		
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		ep.clickSettings();
		ep.clickLicense();
		Thread.sleep(1000);
		verifyPage(driver, LICPTITLE);
		
		LicensePage lip = new LicensePage(driver);
		lip.getProductEdition();
		
		closeApplication();
	}
	
}
