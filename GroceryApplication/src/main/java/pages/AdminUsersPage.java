package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.GeneralUtilities;

public class AdminUsersPage {
public WebDriver driver;
	
	public AdminUsersPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newadminbutton ;
	@FindBy(xpath ="//input[@id='username']")WebElement usernamefield ;
	@FindBy(xpath = "//input[@id='password']")WebElement passwordfield;
	@FindBy(xpath = "//select[@id='user_type']") WebElement usertypedropdown;
//	@FindBy(xpath = "//select[@id='user_type']") WebElement usertypedropdownele;
	@FindBy(xpath = "//button[@name='Create']") WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement successalertmessage;

	
	
	public AdminUsersPage clicknewadminbutton() {
		newadminbutton.click();
		return this;
	}
	public AdminUsersPage enterusername(String Uname) {
		usernamefield.sendKeys(Uname);
		return this;
	}
	public AdminUsersPage enterpassword(String Pswd) {
		passwordfield.sendKeys(Pswd);
		return this;
	}
	
	public AdminUsersPage clickOnUserTypeDropDown() {
		usertypedropdown.click();
		GeneralUtilities gen=new GeneralUtilities();
		gen.selectDropdownWithValue(usertypedropdown, Constant.AdminUserType);
		return this;
		}
	
	public AdminUsersPage clickOnSaveButton() {
		savebutton.click();
		return this;
		
	}
	
	public boolean isAdminUsersInformationsavedDisplayed() {
	    return successalertmessage.isDisplayed();
	}


}
