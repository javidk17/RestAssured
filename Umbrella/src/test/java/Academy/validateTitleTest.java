package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.landingPage;
import resources.Base;

public class validateTitleTest extends Base{
	

	
	@Test
	public void basePageNavigation() throws IOException
	{
	driver=intializeDriver();
	driver.get("http://www.qaclickacademy.com/");
		landingPage l= new landingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	}
		
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}

