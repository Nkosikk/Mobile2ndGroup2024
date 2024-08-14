package Runenrs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
        glue = {"steps"},
//        tags = "@apiDemos",
        plugin = {"pretty"},
        publish = true)
public class runner extends AbstractTestNGCucumberTests {
}
