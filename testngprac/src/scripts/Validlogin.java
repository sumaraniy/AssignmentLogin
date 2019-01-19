package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.Base;
import generic.XL;
import page.Loginpage;


public class Validlogin extends Base {
	
	@Test
	public void testvalidlogin() throws InterruptedException
	{
       
		String un= XL.getCellValue(XL_PATH,"ValidLogin", 1,0);
		
		Loginpage l1 = new Loginpage(driver);
		l1.setEmail(un);
        l1.click_continue();
        l1.com_acc(driver);
	    l1.confirm();
	    l1.verifyEmial(driver);
	    Thread.sleep(1000);
	    driver.close();  
	    
	    
	}

	
   

}



  