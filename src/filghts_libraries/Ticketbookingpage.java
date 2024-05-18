package filghts_libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class Ticketbookingpage extends Apputils

{
	public void tcbooking(String date,String from,String to,String name) throws InterruptedException
	{
		
		driver.findElement(By.id("search-date")).sendKeys(date);
		
		Select pickup = new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/select")));
		pickup.selectByVisibleText(from);
		
		Select drop = new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[3]/select")));
		drop.selectByVisibleText(to);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[4]/button")).click();
		
		
		driver.findElement(By.className("flights_table"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));

			rows.get(4).findElement(By.xpath("/html/body/div[1]/div/div/div[2]/table/tbody/tr[5]/td[9]/button")).click();
		
		
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.id("tickets")).clear();
		driver.findElement(By.id("tickets")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[4]/div/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("View Ticket")).click();
		 String order = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]")).getText();
		order.substring(9);
		System.out.println(order);
	}
	
}
