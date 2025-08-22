package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import constants.Messages;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.GeneralUtilities;

public class CategoryTest extends Base {
	//concept of aggregation
	LoginPage login;
	HomePage home;
	CategoryPage category;
	@Test
	
	public void addnewcategorywithValidDetails() throws IOException {
		 String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		
		 LoginPage login=new LoginPage(driver);
		 login.enterUsername(username).enterPassword(password);
		 home=login.clickOnSignInButton();
		 category=home.clickonmanagecategory().clickonnewbuttontocreateacategory().entercategory(Constant.categoryvalue).adddiscount().fileupload();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement savebutton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 js.executeScript("arguments[0].click();",savebutton);
	
		 
		 boolean successalertmessagedisplayed=category.isCategoryAddedSuccessMessageDisplayed();
		 Assert.assertTrue(successalertmessagedisplayed,Messages.CATEGORYCREATION_ERROR);
	
	}
	
	@Test
	public void searchcategoryaddeddproducts() throws IOException {
		LoginPage login=new LoginPage(driver);
		String username=ExcelUtility.readStringData(1, 0, "loginpage");
		String password=ExcelUtility.readStringData(1, 1, "loginpage");
		login.enterUsername(username).enterPassword(password);
		home=login.clickOnSignInButton();
		category=home.clickonmanagecategory().clicksearchbutton().entersearchproductname().categorysearchbutton();
		boolean iscategorysearchnotfound=category.isNoCategoryFoundDisplayed();
		Assert.assertTrue(iscategorysearchnotfound,Messages.SEARCHCATEGORY_ERROR);

		}
	@Test
	public void editcategorylist() throws IOException {
		login=new LoginPage(driver);
		 String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		 login.enterUsername(username).enterPassword(password);
		 home=login.clickOnSignInButton();
		 category=home.clickonmanagecategory().clickoneditcategorybutton().entercategory(Constant.editcategoryvalue).fileupload();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement updatebutton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 js.executeScript("arguments[0].click();",updatebutton);
		 boolean updatealertmessagedisplayed=category.isCategoryProductUpdatedSuccesfullymessageDisplayed();
		 Assert.assertTrue(updatealertmessagedisplayed,Messages.SUCCESFULLUPDATEDCATEGORY_VALUE);
	
		}
	
	@Test
	public void deletecategory() throws IOException {
		LoginPage login=new LoginPage(driver);
		String username=ExcelUtility.readStringData(1, 0, "loginpage");
		 String password=ExcelUtility.readStringData(1, 1, "loginpage");
		 login.enterUsername(username).enterPassword(password);
		 home=login.clickOnSignInButton();
		 category=home.clickonmanagecategory().clickondeletebutton();
		 boolean deletedalertmessagedisplayed=category.isCategoryProductDeletedmessageDisplayed();
		 Assert.assertTrue(deletedalertmessagedisplayed,Messages.deletedcategoryvaluealertsuccesfully);
	
		}
}
