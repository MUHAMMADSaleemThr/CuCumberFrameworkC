package Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/Feature"},glue = {"Stepdefinitions"},monochrome = true,tags = {"@Adhoc"})
public class Runs {

}
