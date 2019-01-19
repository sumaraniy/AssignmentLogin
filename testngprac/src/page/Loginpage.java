package page;

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

import generic.XL;

public class Loginpage {
		
	 @FindBy(name = "email")
	  private WebElement  emailid;
	 
	  @FindBy(xpath = "//button[@type='button']")
	  private WebElement button;
	  
	  @FindBy(id=  "login__global-login__tenant-select__testtenant3__tenant")
	  private WebElement com_account;
	   
	  @FindBy(id="login__global-login__tenant-select__btn-submit")
	  private WebElement confirm;
	  
	  @FindBy(xpath = "//div[.='User is not found']")
	  private WebElement errmsg;
	  
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	  public void setEmail(String un)
	  {
		  emailid.sendKeys(un);
		
	  }
	  
	  public void click_continue()
	  {
		  button.click();
	  }
	  public void com_acc(WebDriver driver)
	  {
		  
		  WebDriverWait wait=new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOf(com_account));
		  com_account.click();
	  }
	  
	  public void confirm()
	  {
		  confirm.click();
	  }
	   
	  public void verifyEmial(WebDriver driver)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, 10);
	 		
	 		 try {
	 			wait.until(ExpectedConditions.visibilityOf(emailid));
	 			Reporter.log("Pass: Emailid is populated",true);
	 		}
	 		catch(Exception e) {
	 			Reporter.log("FAIL: Emailid is not populated",true);
	 			Assert.fail();
	 		}
	  }  
	   
	   
	   
  public void verifyError(WebDriver driver)
  {
	  WebDriverWait wait=new WebDriverWait(driver, 10);
	  
	  
	  
	  try {
			wait.until(ExpectedConditions.visibilityOf(errmsg));
			Reporter.log("Pass: Error message is displayed",true);
		}
		catch(Exception e) {
			Reporter.log("FAIL: Error message is not displayed",true);
			Assert.fail();
		}
 
	 
  }
	  
	
	
} 



