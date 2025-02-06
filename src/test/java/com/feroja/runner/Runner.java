package com.feroja.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/GreenCard.feature"},
        glue = {"com.feroja.stepDafination"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
