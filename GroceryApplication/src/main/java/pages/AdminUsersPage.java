package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
public WebDriver driver;
	
	public AdminUsersPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newadminbutton ;
	@FindBy(xpath ="//input[@id='username']")WebElement usernamefield ;
	@FindBy(xpath = "//input[@id='password']")WebElement passwordfield;

	
	
	public void clicknewadminbutton() {
		newadminbutton.click();
	}
	public void enterusername() {
		usernamefield.sendKeys("sreerenjini");
	}
	public void enterpassword() {
		passwordfield.sendKeys("tester");
	}


}
