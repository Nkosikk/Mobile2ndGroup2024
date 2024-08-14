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

    private static By apiDemosHeading = By.xpath("//android.widget.TextView[@text=\"API DemosNkosi\"]");

    public MainMenuPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyAppLaunched() {
//        appiumDriverFactory.getDriver().close();

        if (androidUtils.objectExist(apiDemosHeading)) {
            Assert.assertTrue(true, "The app was launched successfully");
        } else {
            Assert.fail("The app was not launched successfully");
        }
    }


}
