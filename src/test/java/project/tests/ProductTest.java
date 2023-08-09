package project.tests;

import framework.setup.SetupDesired;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import project.texnomart.pages.Product;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ProductTest {
    AndroidDriver<AndroidElement> driver = SetupDesired.getDriver();


    public ProductTest() throws MalformedURLException {

    }


    @Test
    public void test() throws InterruptedException, IOException {
        Product product = new Product(driver);
        SetupDesired setupDesired = new SetupDesired();


        product.topProductsInfo();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        product.productScrollDownAndUp();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickCatalog();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickSubCatalog();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickSubInCatalog();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickSortIcon();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickExpensiveCheck();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickProfile();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickFirstInput();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.findElementScroll();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        product.clickFavoriteProduct();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        product.clickCartIcon();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        product.clickCartMenu();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        product.clickCreditInput();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

    }
}
