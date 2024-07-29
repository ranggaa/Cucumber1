package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"featureFiles"},monochrome = true,glue = {"stepDefination"},plugin = {"pretty","html:target/Cucumber-Supplier"})
public class AddSupplier {

}
