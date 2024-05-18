package filghts_libraries;

import org.openqa.selenium.By;

import utils.Apputils;

public class loginpage extends Apputils
{
	public void login(String email,String pwod)
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwod);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
}
