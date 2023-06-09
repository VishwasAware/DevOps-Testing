package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	static WebElement ele=null;

	
	//Static Methods
	
	public static WebElement step1(WebDriver driver)
	{
		
		
		return ele=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]"));
		
	}
	public static WebElement step2(WebDriver driver)
	{
		
		return ele=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		
		
	}
	public static WebElement trustusername (WebDriver driver)
	{
		return ele=driver.findElement(By.name("email"));
		
	}
	public static  WebElement trustpassword (WebDriver driver)
	{
		return ele=driver.findElement(By.name("password"));
		
	}
	public static  WebElement loginbtn (WebDriver driver)
	{
		return ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
	}
	
}
