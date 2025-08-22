package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import constants.Messages;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.Fakerutility;

public class AdminUsersTest extends Base {
	HomePage home;
	LoginPage login;
	AdminUsersPage admin;
	
	@Test
	public void addnewAdminusersInformationwithValidDetails() throws IOException {
		

		 String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		 Fakerutility faker=new Fakerutility();
		 String Uname=faker.username();
		 String Pswd=faker.password();
		
		 LoginPage login=new LoginPage(driver);
		 login.enterUsername(username).enterPassword(password);
		 home=login.clickOnSignInButton();
		 admin=home.clickmanageadmin().clicknewadminbutton().enterusername(Uname).enterpassword(Pswd).clickOnUserTypeDropDown().clickOnSaveButton(); 
		 boolean successalertmessagedisplayed=admin.isAdminUsersInformationsavedDisplayed();
		 Assert.assertTrue(successalertmessagedisplayed,Messages.ADMINUSERCREATION_ERROR);

		
			
		}
	}


