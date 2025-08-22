package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	HomePage home;
	
	@Test
	public void verifyUserloginwithValidCredentials() throws IOException {
		
		String username=ExcelUtility.readStringData(1, 0, "loginpage");
		String password=ExcelUtility.readStringData(1, 1, "loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password);
		home=login.clickOnSignInButton();
		boolean isHomepageload=login.isHomePageLoaded();
		Assert.assertTrue(isHomepageload,Constant.lp_verifyloginwithvalidcredentials);
		  
		}
	
	@Test
	public void verifyuserLoginwithValidUsernamewithInvalidpassword() throws IOException {
		String username=ExcelUtility.readStringData(2, 0, "loginpage");
		String password=ExcelUtility.readStringData(2, 1, "loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password).clickOnSignInButton();
		login.isAlertDisplayed();
		boolean password1=login.isAlertDisplayed();
		Assert.assertTrue(password1, "alert not displayed!!");
		
	}
	
	@Test
	public void verifyUserLoginWithIncorrectUsernameWithCorrectPassword() throws IOException {
		String username=ExcelUtility.readStringData(3, 0, "loginpage");
		String password=ExcelUtility.readStringData(3, 1, "loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password).clickOnSignInButton();
		login.isAlertDisplayed();
		boolean username1=login.isAlertDisplayed();
		Assert.assertTrue(username1, "alert not displayed!!");
		  
		}
	
	@Test
	public void verifyIncorrectUsernameloginwithIncorrectPassword() throws IOException {
		String username=ExcelUtility.readStringData(4, 0, "loginpage");
		String password=ExcelUtility.readStringData(4, 1, "loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password).clickOnSignInButton();
		boolean isAlertDisplayed=login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed,Messages.LOGINCREDENTIALERROR);
		  
		}
	}



	

