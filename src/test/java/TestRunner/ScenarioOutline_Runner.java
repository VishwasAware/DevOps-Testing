package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Feature/ScenarioOUtline_DDT.feature"},
		glue= "StepDefinations",
		plugin = { "pretty", "html:target/cucumber-reports/ScenarioOutline_DDTreport.html",
					"json:reports/myreport.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					}
		)

public class ScenarioOutline_Runner {

}
