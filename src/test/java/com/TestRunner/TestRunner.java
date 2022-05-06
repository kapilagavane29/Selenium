package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFile/register.feature" }, 
		glue = { "com.StepDefination" },
		monochrome=true
		)
public class TestRunner {

}
