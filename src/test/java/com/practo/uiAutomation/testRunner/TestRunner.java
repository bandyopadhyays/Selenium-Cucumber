package com.practo.uiAutomation.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"com.practo.uiAutomation.stepDefinatios"})
public class TestRunner {

}
