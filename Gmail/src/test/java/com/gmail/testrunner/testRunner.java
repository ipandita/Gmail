package com.gmail.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Gmail\\src\\test\\java\\com\\gmail\\featurefiles",glue ="com.gmail.stepdefnition",monochrome = true)
	public class testRunner {
		
	}
