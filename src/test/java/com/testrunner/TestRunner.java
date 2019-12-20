package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue= {"com.stepdef"},monochrome=true,dryRun=false,plugin= {"pretty","html:target/cucumber-report"})

public class TestRunner {

}
