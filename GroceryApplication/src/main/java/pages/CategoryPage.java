package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constant;
import utilities.FileuploadUtility;
import utilities.GeneralUtilities;

public class CategoryPage {
	public WebDriver driver;
	
	FileuploadUtility file=new FileuploadUtility();
	GeneralUtilities gen=new GeneralUtilities();
	
	public CategoryPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']" ) WebElement newbutton;
	@FindBy(xpath = "//input[@id='category']") WebElement newcategoryfield;
	@FindBy(xpath = "//span[text()='discount']") WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']") WebElement addimage;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement successalertmessage;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement findsearchbutton;
	@FindBy(xpath = "//input[@class='form-control']")WebElement entersearchcategoryproductname;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") WebElement categorysearch;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")WebElement nosearchfound;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']") WebElement deletebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement deletealertmessage;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")WebElement editcategorybutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")WebElement updatecategorybutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement updatealertmessage;
	
	public CategoryPage clickonnewbuttontocreateacategory() {
		newbutton.click();
		return this;
		}
	public CategoryPage entercategory(String name) {
		newcategoryfield.sendKeys(name+gen.generateCurrentDateAndTime());
		return this;
	}
	public CategoryPage adddiscount() {
		discount.click();
		return this;
	}
	public CategoryPage fileupload() {
		file.fileuploadmethod(addimage,Constant.image1);
		return this;
		
	}
	public CategoryPage clicksavebutton() {
		savebutton.click();
//		gen.clickJavaScriptExecutor(savebutton, driver);
		return this;
	}
	public boolean isCategoryAddedSuccessMessageDisplayed() {
	    return successalertmessage.isDisplayed();
	}
	public CategoryPage clicksearchbutton() {
		findsearchbutton.click();
		return this;
	}
	public CategoryPage entersearchproductname() {
		entersearchcategoryproductname.sendKeys(Constant.searchproductvalue);
		return this;
	}
	public CategoryPage categorysearchbutton() {
		categorysearch.click();
		return this;
		
	}
	public boolean isNoCategoryFoundDisplayed(){
	    return nosearchfound.isDisplayed();
	}
	public CategoryPage clickoneditcategorybutton() {
		editcategorybutton.click();
		return this;
	}
	public CategoryPage clickupdatecategory() {
		updatecategorybutton.click();
//		gen.clickJavaScriptExecutor(updatecategorybutton, driver);
		return this;
		
	}
	public boolean isCategoryProductUpdatedSuccesfullymessageDisplayed() {
		return updatealertmessage.isDisplayed();
	}
	public CategoryPage clickondeletebutton() {
		deletebutton.click();
		driver.switchTo().alert().accept();
		return this;
	}
	public boolean isCategoryProductDeletedmessageDisplayed() {
		return deletealertmessage.isDisplayed();
	}
	
	}


	
