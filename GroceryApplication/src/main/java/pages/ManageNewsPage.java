package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.GeneralUtilities;

public class ManageNewsPage {
public WebDriver driver;

GeneralUtilities gen=new GeneralUtilities();
	
	public ManageNewsPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")WebElement newsinformationfield;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement savebutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") WebElement searchbutton;
	@FindBy(xpath = "//input[@class='form-control']") WebElement newstitle;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")WebElement searchnewsbutton;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")WebElement nosearchfound;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']")WebElement deletebutton;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")WebElement editbutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")WebElement updatenews;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement updatealertmessage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement deletealertmessage;
	
	
	public ManageNewsPage clicknewbutton() {
		newbutton.click();
		return this;
	}
	public ManageNewsPage enternews(String newsheading) {
		newsinformationfield.sendKeys(newsheading+gen.generateCurrentDateAndTime());
		return this;
	}
	public ManageNewsPage clicksavebutton() {
		savebutton.click();
		return this;
	}
	
	public ManageNewsPage clicksearchbutton() {
		searchbutton.click();
		return this;
	}
	
	public ManageNewsPage entersearchnewsfield() {
		newstitle.sendKeys(Constant.newsseachfield);
		return this;
		}
	public ManageNewsPage clicksearchnews() {
		searchnewsbutton.click();
		return this;
	}
	public boolean isNoNewsFoundDisplayed() {
	    return nosearchfound.isDisplayed();
	}
	public ManageNewsPage clickeditnews() {
		editbutton.click();
		return this;
	}
	public ManageNewsPage clickupdatebutton() {
		updatenews.click();
		return this;
	}
	public boolean isManageNewsUpdatedSuccesfullymessageDisplayed() {
		return updatealertmessage.isDisplayed();
	}
	public ManageNewsPage clickdeletenews() {
		deletebutton.click();
		driver.switchTo().alert().accept();
		return this;
		
	}
	public boolean isManageNewsDeletedSuccesfullymessageDisplayed() {
		return deletealertmessage.isDisplayed();
	}

}
