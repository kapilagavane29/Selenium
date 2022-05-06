package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFile/HomePage.feature" }, 
                glue = { "com.StepDefination" }, 
monochrome = true,
dryRun=false,
plugin= {"json:target/pqr.json"}
)

public class OrangeTestRunner {

}
