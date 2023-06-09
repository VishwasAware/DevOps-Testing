package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut {
	
	static WebElement ele=null;
	public static WebElement step1(WebDriver driver)
	{
		
		
		return ele=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]"));
		
	}
	
	public static WebElement logout(WebDriver driver)
	{
		return ele=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		
	}

}
