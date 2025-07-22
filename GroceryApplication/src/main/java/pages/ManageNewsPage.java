package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
public WebDriver driver;
	
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
	@FindBy(xpath = "//span[@id='res']")WebElement nosearchfound;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']")WebElement deletebutton;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")WebElement editbutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")WebElement updatenews;
	
	
	public void clicknewbutton() {
		newbutton.click();
	}
	public void enternews() {
		newsinformationfield.sendKeys("hbh");
	}
	public void clicksavebutton() {
		savebutton.click();
	}
	
	public void clicksearchbutton() {
		searchbutton.click();
	}
	
	public void entersearchnewsfield() {
		newstitle.sendKeys("NITI Aayog Calls for Cooperative Federalism");
		}
	public void clicksearchnews() {
		searchnewsbutton.click();
	}
	public boolean isNoNewsFoundDisplayed() {
	    return nosearchfound.isDisplayed();
	}
	public void clickeditnews() {
		editbutton.click();
	}
	public void clickupdatebutton() {
		updatenews.click();
	}
	public void clickdeletenews() {
		deletebutton.click();
		
	}
	

}
