package filghts_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class Registraion extends Apputils
{
	public void userRegistration(String name, String email,String pwod,String sex,String dob)
	{
		Apputils.lunchApp("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("address")).sendKeys(pwod);
		Select gen = new Select(driver.findElement(By.name("gender")));
		gen.selectByVisibleText(sex);
		driver.findElement(By.id("popupDatepicker")).sendKeys("11-Jun-2007");
		WebElement chk =  driver.findElement(By.id("flexCheckChecked"));
		if(!chk.isSelected())
		{
			chk.click();
			driver.findElement(By.name("submit")).click();
		}
	}
}
