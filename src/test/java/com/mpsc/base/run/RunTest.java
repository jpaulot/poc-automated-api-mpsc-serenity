package com.mpsc.base.run;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features"
}, tags="@mpsc and not @wip", glue = {"com.mpsc.base.steps.definitionSteps"}, dryRun = false)

public class RunTest {

}