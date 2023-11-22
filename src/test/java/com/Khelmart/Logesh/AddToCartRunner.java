package com.Khelmart.Logesh;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features="C:\\Users\\lsrinivasan\\project\\Khelmart\\Khelmart\\src\\test\\resource\\Features\\AddToCart.feature",glue="com.Khelmart.Logesh",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class AddToCartRunner extends AbstractTestNGCucumberTests {


}
