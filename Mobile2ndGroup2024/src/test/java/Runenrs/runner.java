package Runenrs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
        glue = {"steps"},
//        tags = "@apiDemos",
//We configure the extent cucumber adapter library inside plugin(pretty was removed)
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true)
public class runner extends AbstractTestNGCucumberTests {
}
