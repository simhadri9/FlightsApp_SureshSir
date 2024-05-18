package filghts_libraries;

import org.openqa.selenium.By;

import utils.Apputils;

public class changePasswordpage extends Apputils
{
public void changepassword(String oldpwod,String newpwod) throws InterruptedException
	{
	
		driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.id("address")).sendKeys(oldpwod);
		driver.findElement(By.id("password")).sendKeys(newpwod);
		driver.findElement(By.id("confirm_password")).sendKeys(newpwod);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
	}
	
}
