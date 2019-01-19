package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base implements Const
{

	public WebDriver driver;
	
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
			
	}
	
	@Parameters({"browser"})
	
	@Test
	
		
		
	public void openurl (@Optional("Firefox")String browser)
	{
		
		driver = new FirefoxDriver();
		String url= AL.getvalue(SETTINGS_PATH, "URL");
		driver.get(url);
			
	}
		
	}   
	

	
/* public void openurl(@Optional("chrome")String browser)
{
	if (browser.equals("chrome"))
			{
		
		driver= new ChromeDriver();
		
	}
	else if (browser.equalsIgnoreCase("firefox"))
	{
	
		driver= new FirefoxDriver();
		
	}
	
	
	String url= AL.getvalue(SETTINGS_PATH, "URL");
	driver.get(url);
	
	}
}  */
	
/**
 
   
   * If you like to run the tests as parallel then use the commented code
   *  we can't run the Test class directly(we have to send parameter value from testng.xml)
	I have  added the parameter in testng.xml. you can find the file in the folder: parallel execution xml file.
	*/
	
	
