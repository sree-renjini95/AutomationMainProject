package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {
	@Test(enabled = false) //it will not work
	public void addNewNewswithDetails() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagenews();
		ManageNewsPage newspage=new ManageNewsPage(driver);
		newspage.clicknewbutton();
		newspage.enternews();
		newspage.clicksavebutton();
		
		
	}
	@Test(groups = "smoke")
	public void newssearch() throws IOException {
		ManageNewsPage newspage=new ManageNewsPage(driver);
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagenews();
		newspage.clicksearchbutton();
		newspage.entersearchnewsfield();
		newspage.clicksearchnews();
		 
		boolean isnewssearchnotfound=newspage.isNoNewsFoundDisplayed();
		Assert.assertTrue(isnewssearchnotfound,"......no news search found.....");
		
		
		
	}
	@Test
	public void editnews() throws IOException {
		ManageNewsPage newspage=new ManageNewsPage(driver);
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagenews();
		newspage.clickeditnews();
		newspage.enternews();
		newspage.clickupdatebutton();
	}
	@Test
	public void deletenews() throws IOException {
		ManageNewsPage newspage=new ManageNewsPage(driver);
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagenews();
		newspage.clickdeletenews();
		
	}

}
