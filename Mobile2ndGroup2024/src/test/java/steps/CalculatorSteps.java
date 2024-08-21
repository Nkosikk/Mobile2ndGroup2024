package steps;

import io.cucumber.java.en.*;

public class CalculatorSteps extends Base{

    @Given("app is launched")
    public void app_is_launched() {
        calculatorPage.verifyAppLaunched();

    }
    @And("The user click one")
    public void the_user_click_one() {
        calculatorPage.clickButtonNumberOne();
    }
    @And("The user click the plus button")
    public void the_user_click_the_plus_button() {
        calculatorPage.clickPlusButton();

    }
    @When("The user click equal button")
    public void the_user_click_equal_button() {
        calculatorPage.clickEqualButton();
    }

    @Then("The correct Answer is displayed {string}")
    public void theCorrectAnswerIsDisplayedAnswer(String number) {
        calculatorPage.verifyCorrectAnswerDisplayed(number);
    }

}
