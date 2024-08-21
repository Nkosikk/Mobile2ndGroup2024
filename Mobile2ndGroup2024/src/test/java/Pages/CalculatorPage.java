package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CalculatorPage {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumFactory();
    AndroidUtils androidUtils;

    private static By clearButton = By.xpath("//android.widget.ImageButton[@content-desc=\"clear\"]");
    private static By buttonOne = By.xpath("//android.widget.ImageButton[@content-desc=\"1\"]");
    private static By AdditionButton = By.xpath("//android.widget.ImageButton[@content-desc='plus']");
    private static By EqualButton = By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]");
    private static By answerButton = By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]");

    public CalculatorPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyAppLaunched() {
//        appiumDriverFactory.getDriver().close();
        if (androidUtils.objectExist(clearButton)) {
            Assert.assertTrue(true, "The app was launched successfully");
        } else {
            Assert.fail("The app was not launched successfully");
        }
    }

    public void clickButtonNumberOne() {
        androidUtils.clickButton(buttonOne);
    }

    public void clickPlusButton() {
        androidUtils.clickButton(AdditionButton);
    }

    public void clickEqualButton() {
        androidUtils.clickButton(EqualButton);
    }

    public void verifyCorrectAnswerDisplayed(String number) {
        androidUtils.verifyAnswers(answerButton,number);
    }
}
