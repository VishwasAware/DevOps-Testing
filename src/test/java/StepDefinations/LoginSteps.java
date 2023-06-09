package StepDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	ChromeDriver driver=new ChromeDriver();
	

	@Given("I visit to the TutorialsNinja Website")
	public void I_visit_to_the_TutorialsNinja_Website() 
	{
	
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
					
	} 

	
	@When("I enter the username and password")
	public void LoginwithValidCredentials()

	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.name("email")).sendKeys("abcg@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		
	}
	
	
	@And("I clicked on login")
	public void I_clicked_on_login()
	
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
	
	
	@Then("user should login")
	public void user_should_login()

	{ 
		System.out.println("Successfully Logged in .!!!!!");
	
	}
}