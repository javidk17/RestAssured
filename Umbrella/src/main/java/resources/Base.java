package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException
	{
		//chrome
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\satya\\Desktop\\javid\\End2End\\Umbrella\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\Desktop\\javid\\chromedriver_win32_1\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}

		//firefox
		else if(browserName.equals("Firefox"))
		{
			
			System.setProperty("webdriver.gekco.driver", "C:\\Users\\satya\\Desktop\\javid\\geckodriver-v0.29.0-win64.exe");
			driver= new FirefoxDriver();
		}
		//IE
		else if(browserName.equals("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\satya\\Desktop\\javid\\IEDriverServer_Win32_2.39.0.exe");
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	}
	
