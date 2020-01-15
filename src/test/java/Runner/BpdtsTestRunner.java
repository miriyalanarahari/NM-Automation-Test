package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\narah\\eclipse-workspace\\AutomationTest\\src\\test\\java\\Features\\BpdtsTest.Feature", glue = {
		"StepDefinitions" }, dryRun = false, monochrome = true
, format = {"pretty", "html:target/Destination"} 
)   

public class BpdtsTestRunner {

}