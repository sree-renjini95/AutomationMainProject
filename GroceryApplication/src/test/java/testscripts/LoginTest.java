package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import pages.LoginPage;

public class LoginTest extends Base {
	@Test
	public void verifyUserloginwithValidCredentials() throws IOException {
		 LoginPage login=new LoginPage(driver);
//		login.enterUsername("admin");
//		login.enterPassword("admin");
//		login.clickOnSignInButton();
		 
		 
		 login.loginbyusingexceldata();
		 boolean isHomepageload=login.isHomePageLoaded();
		  Assert.assertTrue(isHomepageload,Constant.lp_verifyloginwithvalidcredentials);
		  
		}
	
	@Test
	public void verifyuserLoginwithValidUsernamewithInvalidpassword() {
		LoginPage login=new LoginPage(driver);
		login.enterUsername("admin");
		login.enterPassword("12345");
		login.clickOnSignInButton();
		login.isAlertDisplayed();
		boolean password=login.isAlertDisplayed();
		  Assert.assertTrue(password, "alert not displayed!!");
	}
	
	@Test
	public void verifyUserLoginWithIncorrectUsernameWithCorrectPassword() {
		LoginPage login=new LoginPage(driver);
		login.enterUsername("jjjjl");
		login.enterPassword("admin");
		login.clickOnSignInButton();
		login.isAlertDisplayed();
		boolean username=login.isAlertDisplayed();
		  Assert.assertTrue(username, "alert not displayed!!");
		  
		
	}
	  @Test(dataProvider = "Stringmethod")
		public void verifyIncorrectUsernameloginwithIncorrectPassword(String username,String password) {
			
			LoginPage login = new LoginPage(driver);
			login.enterUsername(username);
			login.enterPassword(password);
//			login.enterUsername("renjini");
//			login.enterPassword("123456");
			login.clickOnSignInButton();
			 boolean isAlertDisplayed=login.isAlertDisplayed();
			 Assert.assertTrue(isAlertDisplayed,"alert not displayed");
			
		}
		@DataProvider
		public Object[][] Stringmethod(){
			return new Object[][] {{"admin","admin"},{"jjjkkk","1q2w3e4r"},
				{"admin","123334"},{"renjini","12345"}};
			
		}
	}



	

