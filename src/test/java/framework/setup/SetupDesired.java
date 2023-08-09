package framework.setup;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;


public class SetupDesired {
    protected ResourceBundle TESTDATA;
    static AndroidDriver<AndroidElement> driver;


    @BeforeSuite
    public static AndroidDriver getDriver() throws MalformedURLException {
        try {
            DesiredCapabilities cp = new DesiredCapabilities();
            cp.setCapability("platformName", "android");
            cp.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            cp.setCapability("newCommandTimeout", 120);
            cp.setCapability("appPackage", "com.texnomart.app");
            cp.setCapability("appActivity", "com.texnomart.app.screen.MainActivity");
            cp.setCapability("app", "D:\\Texnomart\\texnomart.apk");
            cp.setCapability("noReset", "true");
            cp.setCapability("fullReset", "false");
            cp.setCapability(MobileCapabilityType.NO_RESET, "true");
            cp.setCapability(MobileCapabilityType.FULL_RESET, "false");
            cp.setCapability("automationName", "uiautomator2");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<AndroidElement>(url, cp);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        } catch (Exception exp) {
            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
        }

        return driver;
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
