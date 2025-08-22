package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LoginPage {

		public WebDriver driver;
		
		public LoginPage(WebDriver driver ) {
			this.driver=driver;
			PageFactory.initElements(driver, this); //use to initialize the web elements
		}
		@FindBy(xpath = "//input[@placeholder='Username']")WebElement usernamefield;
		@FindBy(xpath = "//input[@placeholder='Password']")WebElement passwordfield;
		@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")WebElement signinbutton;
		@FindBy(xpath = "//div[@class='content-header']")WebElement HomepageOpen;
		@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")WebElement alertmessage;
		
		
		
		public LoginPage enterUsername(String username) {
			usernamefield.sendKeys(username);
			return this;
			
		}
		public LoginPage enterPassword(String password) {
			passwordfield.sendKeys(password);
			return this;
		}
		
		public HomePage clickOnSignInButton() {
			signinbutton.click();
			return new HomePage(driver);
		}
		
		public boolean isHomePageLoaded() {
			return HomepageOpen.isDisplayed();
		}
		public boolean isAlertDisplayed() {
			return alertmessage.isDisplayed();
		}
		
//		public HomePage loginbyusingexceldata() throws IOException {
//			String username=ExcelUtility.readStringData(1, 0, "loginpage");
//			String password=ExcelUtility.readStringData(1, 1, "loginpage");
//			usernamefield.sendKeys(username);
//			passwordfield.sendKeys(password);
//			signinbutton.click();
//			return new HomePage(driver);
//			
//		}
		}
	


