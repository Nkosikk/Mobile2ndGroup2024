package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainMenuPage {
    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumFactory();
    AndroidUtils androidUtils;

//We are now locating elements location
//We shld make sure appium is started in cmd,appium inspector is running,the phone is started
    private static By apiDemosHeading = By.xpath("//android.widget.TextView[@text=\"API Demos\"]");

//This is the page's constructor
    public MainMenuPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }
//After locating the element we shld create a method for the 1st action that we are to do
    public void verifyAppLaunched() {
//        appiumDriverFactory.getDriver().close();

        if (androidUtils.objectExist(apiDemosHeading)) {
            Assert.assertTrue(true, "The app was launched successfully");
        } else {
            Assert.fail("The app was not launched successfully");
        }
    }


}
