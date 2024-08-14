package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

//We will create reusable methods in this class
public class AndroidUtils {
    private AppiumDriver driver;

//Below is our constructor
    public AndroidUtils(AppiumDriver driver) {
        this.driver = driver;
    }

//Below is our first reusable method
    public Boolean objectExist(By by) {
        if (driver.findElements(by).size() == 0) {
            assert false;
            return false;
        } else {
            assert true;
            return true;
        }
    }
}
