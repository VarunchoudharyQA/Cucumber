package com.cloudamize.cmp.automation.cucumber.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class LoginTestRunner 
{
	
	@CucumberOptions(features= "Feature",glue= {"com.cloudamize.cmp.automation.cucumber.step"})
	@Test
	public class RunTest extends AbstractTestNGCucumberTests{

	}

}
