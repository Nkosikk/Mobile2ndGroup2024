package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Before the code created in mainmenu feature file is completed, this class is created
//It is the master mind of the whole project
public class AppiumDriverFactory {
    //The driver; below will hold our session
    public static AppiumDriver driver;

    //We create the below so that we are able to call this class/session from other page classes
    public static AppiumDriverFactory instanceOfAppiumFactory;

    //The below is our method where we will put our desired capabilities
    //We use the capabilities from appium inspector to start the browser
    public AppiumDriverFactory() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/src/main/Apps/ApiDemos-debug.apk");
        capabilities.setCapability("platformName", "Android");

    //We need to start appium in cmd then get the URL specified (only accessible from the same host)
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    public static AppiumDriverFactory getInstanceOfAppiumFactory() {
        if (instanceOfAppiumFactory == null)
            instanceOfAppiumFactory = new AppiumDriverFactory();
        return instanceOfAppiumFactory;

    }

    public AppiumDriver getDriver(){
        return driver;
    }


}
