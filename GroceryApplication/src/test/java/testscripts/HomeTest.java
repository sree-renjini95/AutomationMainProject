package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	@Test
	public void clickhomepagelogout() throws IOException {
		String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		 LoginPage login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password);
		HomePage homepage=new HomePage(driver);
		homepage=login.clickOnSignInButton();
		homepage.clickhomeadmin();  // Clicks Admin avatar to open dropdown
		homepage.clicklogout(); 
		boolean logout=homepage.isLogoutSuccess();
		Assert.assertTrue(logout, Messages.LOGOUTERROR);
		  }
	
	}
	
	


