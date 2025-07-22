package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends Base{
@Test
	public void editContactusWithValidDetails() throws IOException {
	LoginPage login=new LoginPage(driver);
	login.loginbyusingexceldata();
	HomePage homepage=new HomePage(driver);
	homepage.clickmanagecontact();
	ManageContactPage managecontactpage=new ManageContactPage(driver);
	managecontactpage.clickeditbutton();
	}

}
