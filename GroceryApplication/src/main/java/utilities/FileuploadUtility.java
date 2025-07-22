package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileuploadUtility {
		//method-fileupload method using sendkeys
		public void fileuploadmethod(WebElement element,String filepath) {
			
			element.sendKeys(filepath);
		
		}
		//method-fileupload method using robotclass
		public void fileuploadrobot(WebElement element,String filepath) throws AWTException{
			StringSelection s=new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
			Robot robot=new Robot();
			robot.delay(500);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.delay(500);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.delay(500);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		}
			
	}
	
