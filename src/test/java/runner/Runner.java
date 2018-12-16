package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features" },glue = "steps",tags={"@selenium"},format={"json:ank.json"})
public class Runner extends AbstractTestNGCucumberTests {

}
