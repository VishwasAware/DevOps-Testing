package StepDefinations;


import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.junit.After;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.MapReduceCommand.OutputType;

import POM.Login;
import POM.MyAccountPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline_DDT {
	
	
	ChromeDriver driver=new ChromeDriver();
	MyAccountPage myacc;
	Login lp;
	Logger logger;
	
	@Before
	public void Setup()
	{
		//for logging
		logger= LogManager.getLogger(this.getClass());
	}
	
	@After
	public void teardown()
	{
		
	}
	
	@Given("I visit the TutorialNinja Website")
	public void i_visit_the_tutorial_ninja_website() {
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	   logger.info("Browser Opend....!!");
	}

	@And("I click on MyAccount Option")
	public void i_click_on_my_account_option() {
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
		//lp.step1(driver);
		logger.info("Clicked on My AccountOption....");
	   
	}

	@Then("I Select the Login Option")
	public void i_select_the_login_option() {
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		//lp.step2(driver);
		logger.info("Login Option Selected...");
	
	    
	}

	@When("I Entered username as {string} and Password as {string}")
	public void i_entered_username_as_and_password_as(String Email, String Password) {
		
//		driver.findElement(By.name("email")).sendKeys(Email);
//		driver.findElement(By.name("password")).sendKeys(Password);
		lp.trustusername(driver).sendKeys(Email);
		lp.trustpassword(driver).sendKeys(Password);
		logger.info("ENtered Credentials....");
	    
	}

	@And("Clicked on Login")
	public void clicked_on_login() {
	   
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		logger.info("Final CLicked on login...");
	
	}

	
	@Then("User should be able to get inside the TutorialsNinja Website")
	public void user_should_be_able_to_get_inside_the_tutorials_ninja_website() {
		myacc=new MyAccountPage(driver);
		boolean targetpage=myacc.isMyAccountPageExists();
		
		if(targetpage)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
//			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//			File SrcFile=scrShot.getScreenshotAs
//					FileUtils.copyFile(scrShot,"C:\\Users\\VishwasA.MUMBAI1\\DevOps_Testing_June\\DevOps\\Screenshot\\error.png");
		}
		
	System.out.println("Logged into the Website....");
	logger.info("Welcome Page....");

	driver.close();
	}
}

