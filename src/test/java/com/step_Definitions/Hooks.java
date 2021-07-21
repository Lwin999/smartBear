package com.step_Definitions;

import com.utility.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

    public class Hooks {
        @Before(value = "@login",order = 1)
        public void setupScenario(){
            System.out.println("Setting up browser with further details...");
        }
        @After
        public void TearDownScenario(Scenario scenario){
            System.out.println("--Teaddown steps are being applied...");
            //Driver.closeDriver();

            if (scenario.isFailed()){

                byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());

            }
        }
        @BeforeStep
        public void setupStep(){
            System.out.println("-- setup applying for each step");
        }
        @AfterStep
        public void afterStep(){
            System.out.println("--teardown appliying for each step");
        }
    }


