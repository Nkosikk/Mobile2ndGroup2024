package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Utils.AppiumDriverFactory.driver;

public class StepsDef extends Base {

    @Given("App is launched")
    public void app_is_launched() {
        mainMenuPage.verifyAppLaunched();
    }
    @And("I verify that APi demos heading is displayed")
    public void i_verify_that_a_pi_demos_heading_is_displayed() {
        mainMenuPage.verifyAppLaunched();
    }

//    @Given("I am on the API Demos Main Menu page")
//    public void i_am_on_the_api_demos_main_menu_page() {
//        }
//    @And("I click the App element")
//    public void i_click_the_app_element() {
//    }

    //Here we are creating a method to take screenshots
    //The Scenario below will allow us to communicate with each step, variable scenario is also created
    //Once done with method, put @AfterStep, meaning its done at the end of each step
    @AfterStep
    public void takesScreenshotOnFailure(Scenario scenario) {
        //Scenario in features - if it fails, take screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failure Screenshot");
        }
    }

}
