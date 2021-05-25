package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
           dryRun = false,
           features = {"src/test/java/features/MergeLead.feature"},
           glue = {"stepDefinition"},
           monochrome = true
           )
           
public class TestNgCucumberTest extends AbstractTestNGCucumberTests {
	
			
	

}
