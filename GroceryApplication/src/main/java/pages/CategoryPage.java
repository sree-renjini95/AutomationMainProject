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

public class CategoryPage {
	public WebDriver driver;
	
	FileuploadUtility file=new FileuploadUtility();
	
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
	@FindBy(xpath = "//span[@id='res']")WebElement nosearchfound;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']") WebElement deletebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement deletealertmessage;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")WebElement editcategorybutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")WebElement updatecategorybutton;
	public void clickonnewbutton() {
		newbutton.click();
		}
	public void entercategory() {
		newcategoryfield.sendKeys("1snacks");
	}
	public void adddiscount() {
		discount.click();
	}
	public void fileupload() {
//		addimage.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\images\\Party-Snacks-Combo-Pack-Suppliers-Bangalore.jpg");
		file.fileuploadmethod(addimage,Constant.image1);
		
	}
	public void clicksavebutton() {
		savebutton.click();
	}
	public boolean isCategoryAddedSuccessMessageDisplayed() {
	    return successalertmessage.isDisplayed();
	}
	public void clicksearchbutton() {
		findsearchbutton.click();
	}
	public void entersearchproductname() {
		entersearchcategoryproductname.sendKeys("snacks");
	}
	public void categorysearchbutton() {
		categorysearch.click();
		
	}
	public boolean isNoNewsFoundDisplayed() {
	    return nosearchfound.isDisplayed();
	}
	public void clickoneditcategorybutton() {
		editcategorybutton.click();
	}
	public void clickupdatecategory() {
		updatecategorybutton.click();
		
	}
	public void clickondeletebutton() {
		deletebutton.click();
	}
	public boolean isCategoryProductDeletedmessageDisplayed() {
		return deletealertmessage.isDisplayed();
	}
	
	}


	
