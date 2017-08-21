package com.practo.uiAutomation.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features={"classpath:featurefiles/Login&Logout.feature"},glue={"com.practo.uiAutomation.stepDefinatios"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
