package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends Base {
	@Test
	public void clickhomepagelogout() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		  homepage.clickhomeadmin();  // Clicks Admin avatar to open dropdown
		  homepage.clicklogout(); 
		  
		
		  
	}
	
	}
	
	


