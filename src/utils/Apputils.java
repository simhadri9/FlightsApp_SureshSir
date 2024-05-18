package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Apputils 
{
	public static WebDriver driver;
	
	public static void lunchApp(String url)
	
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://flights.qedgetech.com");
	}
	
	public static void closaApp()
	{
		driver.close();
		
	}
	
}
