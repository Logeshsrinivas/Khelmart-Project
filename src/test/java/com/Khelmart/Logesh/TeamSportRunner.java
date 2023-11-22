package com.Khelmart.Logesh;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags="",features="src\\test\\resource\\Features\\TeamSport.feature",glue="com.Khelmart.Logesh",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TeamSportRunner extends AbstractTestNGCucumberTests {

}
