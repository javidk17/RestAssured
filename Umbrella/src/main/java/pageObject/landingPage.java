package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	By Login=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("#content > div > div > h2");
	

	public landingPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public WebElement getLogin() {
		return driver.findElement(Login);
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
}
