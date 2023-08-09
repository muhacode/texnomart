package project.texnomart.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import project.texnomart.elements.ProductElements;

import java.util.concurrent.TimeUnit;

public class Product {
    private AndroidDriver<AndroidElement> driver;
    private ProductElements productElements;

    public Product(AndroidDriver driver) {
        this.driver = driver;
        productElements = new ProductElements(driver);
    }
    public void topProductsInfo() throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Tavsiya etamiz\").instance(0))");
        Thread.sleep(2000);
        productElements.clickProInfo().click();
    }
    public void productScrollDownAndUp(){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Savatchaga\").instance(0))");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        productElements.clickBackIcon().click();
    }
    public void clickCatalog(){
        productElements.clickCatalog().click();
    }
    public void clickSubCatalog(){
        productElements.clickSubCatalog().click();
    }
    public void clickSubInCatalog(){
        productElements.clickSubInCatalog().click();
    }
    public void clickSortIcon(){
        productElements.clickSortIcon().click();
    }
    public void clickExpensiveCheck(){
        productElements.clickCheckbox().click();
    }
    public void clickProfile(){
        productElements.clickProfile().click();
    }
    public void clickFirstInput(){
        productElements.clickFirstInput().click();
    }
    public void findElementScroll(){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Sizdan xarid – bizdan Damas!\").instance(0))");
        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Har bir xarid uchun sovg’a\").instance(0))");
        productElements.clickBackIcon().click();
    }

    public void clickFavoriteProduct(){
        productElements.clickFavoriteProduct().click();
    }
    public void clickCartIcon(){
        productElements.clickCartIcon().click();
    }
    public void clickCartMenu(){
        productElements.clickCartMenu().click();
    }
    public void clickCreditInput(){
        productElements.clickCreditInput().click();
    }



}
