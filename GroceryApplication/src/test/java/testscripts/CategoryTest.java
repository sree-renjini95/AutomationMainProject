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
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;

public class CategoryTest extends Base {
	@Test
	
	public void addnewcategorywithValidDetails() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagecategory();
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.clickonnewbutton();
		categorypage.entercategory();
		categorypage.adddiscount();
		categorypage.fileupload();
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement savebutton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		js.executeScript("arguments[0].click();",savebutton);
//		categorypage.clicksavebutton();
		
		boolean successalertmessagedisplayed=categorypage.isCategoryAddedSuccessMessageDisplayed();
		Assert.assertTrue(successalertmessagedisplayed, "Success message not displayed after adding category.");

		
		
	}
	
	@Test
	public void searchcategoryaddeddproducts() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagecategory();
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.clicksearchbutton();
		categorypage.entersearchproductname();
		categorypage.categorysearchbutton();
		boolean iscategorysearchnotfound=categorypage.isNoNewsFoundDisplayed();
		Assert.assertTrue(iscategorysearchnotfound,"......no  search found.....");
		
		
		
		
		
	}
	@Test
	public void editcategorylist() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagecategory();
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.clickoneditcategorybutton();
		categorypage.entercategory();
		categorypage.fileupload();
//		categorypage.clickupdatecategory();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement updatebutton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		js.executeScript("arguments[0].click();",updatebutton);
		
		
	}
	
	@Test
	public void deletecategory() throws IOException {
		LoginPage login=new LoginPage(driver);
		login.loginbyusingexceldata();
		HomePage homepage=new HomePage(driver);
		homepage.clickonmanagecategory();
		CategoryPage categorypage=new CategoryPage(driver);
		
		
		categorypage.clickondeletebutton();
		boolean deletedalertmessagedisplayed=categorypage.isCategoryProductDeletedmessageDisplayed();
		Assert.assertTrue(deletedalertmessagedisplayed, "Category Deleted Successfully");
		
		
		
	}
	

}
