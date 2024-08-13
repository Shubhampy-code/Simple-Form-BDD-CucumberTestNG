package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\Shubham Shrivastava\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SimpleForm\\src\\test\\resources\\SeleiumSampleForm\\SimpleForm.feature",
glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
