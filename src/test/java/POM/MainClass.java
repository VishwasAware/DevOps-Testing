package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Login.step1(driver).click();
		Login.step2(driver).click();
		Login.trustusername(driver).sendKeys("abcg@gmail.com");
		Login.trustpassword(driver).sendKeys("1234567890");
		Login.loginbtn(driver).click();
		
		LogOut.step1(driver).click();
		LogOut.logout(driver).click();
		
		
		
	}

}
