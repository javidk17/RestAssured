package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Email=By.cssSelector("[id='user_email']");
	By Password=By.cssSelector("[type='password']");
	By Login=By.cssSelector("[type='submit']");

	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(Login);
	}

}
