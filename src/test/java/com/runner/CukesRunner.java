package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/reports/cucumber-report.html",
        features = "src/test/resources/feature",
        glue = "com/step_Definitions",
        dryRun = false,
        tags = "@smartBear2"
)
public class CukesRunner {
}

