package scripts;

import org.testng.annotations.Test;

import generic.Base;
import generic.XL;
import page.Loginpage;

public class InvalidLogin extends Base {

	@Test
	public void testvalidlogin() throws InterruptedException
	{		
	
		String invalid= XL.getCellValue(XL_PATH,"InvalidLogin", 1,0);
		
		Loginpage l1 = new Loginpage(driver);
		l1.setEmail(invalid);
        l1.click_continue(); 
        l1.verifyError(driver);
	   
	    driver.close();  
	    
	    
	}

	
   
}
