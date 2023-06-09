package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"StepDefinations"},
		plugin = { "pretty", "html:target/cucumber-reports/Loginreport.html" },
		tags  = "@Smoke or @Regression"
		
		)

public class LoginRunner {
	
	
}
