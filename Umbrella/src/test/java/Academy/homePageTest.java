package Academy;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.landingPage;
import resources.Base;

public class homePageTest extends Base{
	

	@Test
	public void basePageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		landingPage l= new landingPage(driver);
		l.getLogin().click();
	}
	
	@Test
	public void pageAccess()
	{
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("Hello");
		lp.getPassword().sendKeys("Passssword");
		lp.getSubmit().click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}

