package steps;

import io.cucumber.java.en.*;

public class StepsDef extends Base {

    @Given("App is launched")
    public void app_is_launched() {
        mainMenuPage.verifyAppLaunched();

    }

    @And("I verify that APi demos heading is displayed")
    public void i_verify_that_a_pi_demos_heading_is_displayed() {
        mainMenuPage.verifyAppLaunched();

    }
}
