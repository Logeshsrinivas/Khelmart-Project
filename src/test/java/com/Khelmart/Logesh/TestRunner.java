package com.Khelmart.Logesh;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\Features",glue="com.Khelmart.Logesh",plugin = {"json:target/cucumber-report.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner  {
//@Override
//@DataProvider(parallel=true)
//public Object[][] scenarios(){
//	return super.scenarios();
//}
}
