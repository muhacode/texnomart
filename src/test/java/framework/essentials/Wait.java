package framework.essentials;

import framework.setup.SetupDesired;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Wait {
    static AndroidDriver<AndroidElement> driver;

    static {
        try {
            driver = SetupDesired.getDriver();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    protected WebDriverWait wait_5() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 5);
        return new WebDriverWait(driver, 5);
    }

    protected WebDriverWait wait_10() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 10);
        return new WebDriverWait(driver, 10);
    }

    protected WebDriverWait wait_20() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 20);
        return new WebDriverWait(driver, 20);
    }

    protected WebDriverWait wait_30() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 30);
        return new WebDriverWait(driver, 30);
    }

    protected WebDriverWait wait_40() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 40);
        return new WebDriverWait(driver, 40);
    }

    protected WebDriverWait wait_50() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 50);
        return new WebDriverWait(driver, 50);
    }

    protected WebDriverWait wait_60() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 60);
        return new WebDriverWait(driver, 60);
    }

    protected WebDriverWait wait_70() {
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 70);
        return new WebDriverWait(driver, 70);
    }

    protected WebDriverWait wait_80() {
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 80);
        return new WebDriverWait(driver, 80);
    }

    protected WebDriverWait wait_90() {
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 90);
        return new WebDriverWait(driver, 90);
    }

    protected WebDriverWait wait_100() {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        waitUntilJqueryIsDone((long) 100);
        return new WebDriverWait(driver, 100);
    }

    protected void waitUntilJqueryIsDone(Long timeInSeconds) {
        until((d) -> {
            return (Boolean) ((JavascriptExecutor) driver).executeScript("return window.jQuery == undefined || jQuery.active == 0");
        }, timeInSeconds);
    }

    private void until(Function<WebDriver, Boolean> waitCondition, Long timeInSeconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeInSeconds);
        webDriverWait.withTimeout(Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(waitCondition);
    }


}
