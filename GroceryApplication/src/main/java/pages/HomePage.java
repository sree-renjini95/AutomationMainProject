package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	public HomePage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']") WebElement managecategory;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement manangenews;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement manageadmin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement managecontact;

	//for admin logout
	@FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement clickadmin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logoutbutton;
	 
	public void clickonmanagecategory() {
		managecategory.click();
	}
	public void clickonmanagenews() {
		manangenews.click();
	}
	
	public void clickmanageadmin() {
		manageadmin.click();
	}
	public void clickmanagecontact() {
		managecontact.click();
	}
	
	public void clickhomeadmin() {
		clickadmin.click();
	}
	
	public void clicklogout() {
		logoutbutton.click();
		
	}
}

