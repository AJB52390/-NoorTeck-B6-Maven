package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
//add nane 2
//add name
				features = "src/test/resources/OrangeHRM/",
				glue = {"steps"},
				plugin = {"pretty","html:target/cucumber-report.html"},
				monochrome = true

)

public class XYZRunnerTest {

}

