package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import constants.Messages;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	LoginPage login;
	HomePage home;
	ManageNewsPage news;
	@Test(enabled = true) //it will not work if we set false
	public void addNewNewswithDetails() throws IOException {
		 String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		 LoginPage login=new LoginPage(driver);
		 login.enterUsername(username).enterPassword(password);
		 home=login.clickOnSignInButton();
		 news=home.clickonmanagenews().clicknewbutton().enternews(Constant.newsfieldvalue).clicksavebutton();
		
}
	@Test(groups = "smoke")
	public void newssearch() throws IOException {
		LoginPage login=new LoginPage(driver);
		 String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		 login.enterUsername(username).enterPassword(password);
		 home=login.clickOnSignInButton();
		 news=home.clickonmanagenews().clicksearchbutton().entersearchnewsfield().clicksearchnews();
		 boolean isnewssearchnotfound=news.isNoNewsFoundDisplayed();
		 Assert.assertTrue(isnewssearchnotfound,Messages.NEWSSEARCH_ERROR);

		}
	@Test
	public void editnews() throws IOException {
		
		 String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password);
		home=login.clickOnSignInButton();
		news=home.clickonmanagenews().clickeditnews().enternews(Constant.editnewsvalue).clickupdatebutton();
		boolean updatealertmessagedisplayed=news.isManageNewsUpdatedSuccesfullymessageDisplayed();
		Assert.assertTrue(updatealertmessagedisplayed,Messages.SUCCESFULLUPDATENEWS);
	}
	@Test
	public void deletenews() throws IOException {
		String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		login=new LoginPage(driver);
		login.enterUsername(username).enterPassword(password);
		home=login.clickOnSignInButton();
		news=home.clickonmanagenews().clickdeletenews();
		boolean alertmessagedisplayedonsuccesfulldeletion=news.isManageNewsDeletedSuccesfullymessageDisplayed();
		Assert.assertTrue(alertmessagedisplayedonsuccesfulldeletion,Messages.SUCCESFULLDELETENEWSMESSAGE);
	}

}
