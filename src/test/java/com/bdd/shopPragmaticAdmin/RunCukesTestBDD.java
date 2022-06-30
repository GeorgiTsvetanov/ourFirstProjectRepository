package com.bdd.shopPragmaticAdmin;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"progress", "html:target/cucumber-html-report"},
        features = "src/test/resources",
        glue = "com.bdd")
public class RunCukesTestBDD extends AbstractTestNGCucumberTests {
}
