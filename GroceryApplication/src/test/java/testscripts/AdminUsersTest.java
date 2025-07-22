package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class AdminUsersTest extends Base {
	@Test
	public void addnewcategorywithValidDetails() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickmanageadmin();
		AdminUsersPage adminuserpage=new AdminUsersPage (driver);
		adminuserpage.clicknewadminbutton();
		adminuserpage.enterusername();
		adminuserpage.enterpassword();
		
			
		}
	}


