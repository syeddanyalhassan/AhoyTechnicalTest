package com.ahoy.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ahoy.qa.utility.Constants;


public class BasePage {

	public static WebDriver driver;
	static Properties prop;

	public BasePage() {
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ahoy\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void Initialization() throws InterruptedException
	{
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
	}
}
