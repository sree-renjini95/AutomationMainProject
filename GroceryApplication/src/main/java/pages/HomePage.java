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
	@FindBy(xpath = "//a[@class='small-box-footer' and contains(@href,'list-admin')]") WebElement manageadmin;
	@FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement clickadmin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logoutbutton;
	@FindBy(xpath = "//input[@placeholder='Username']")WebElement usernamefield;
	 
	public CategoryPage clickonmanagecategory() {
		managecategory.click();
		return new CategoryPage(driver);
	}
	public ManageNewsPage clickonmanagenews() {
		manangenews.click();
		return new ManageNewsPage(driver);
	}
	
	public AdminUsersPage clickmanageadmin() {
		manageadmin.click();
		return new AdminUsersPage(driver);
	}
	
	public HomePage clickhomeadmin() {
		clickadmin.click();
		return new HomePage(driver);
	}
	
	public HomePage clicklogout() {
		logoutbutton.click();
		return new HomePage(driver);
		
	}
	public boolean isLogoutSuccess() {
		return usernamefield.isDisplayed();
	}
}

