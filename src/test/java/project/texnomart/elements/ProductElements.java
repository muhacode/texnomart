package project.texnomart.elements;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ProductElements {
    private final String proInfo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android." +
            "view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/androidx.recyclerview." +
            "widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]";
    private final String backIcon = "com.texnomart.app:id/ivBack";
    private final String searchInput = "com.texnomart.app:id/ivSearch";
    private final String elementClick = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android." +
            "view.ViewGroup/android.view.ViewGroup/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[3]/" +
            "android.view.ViewGroup";
    private final String catalog = "com.texnomart.app:id/navigation_catalog";
    private final String subCatalog = "//*[@text='Smartfonlar va gadjetlar']";
    private final String subInCatalog = "//*[@text='Smartfonlar']";
    private final String sortIcon = "com.texnomart.app:id/sort_product";
    private final String expensiveCheck = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget" +
            ".FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]";
    private final String profile = "com.texnomart.app:id/navigation_profile";
    private final String firstInput = "//*[@text='Aksiya']";
    private final String favoriteProduct = "//*[@text='Sevimlilar']";
    private final String cartIcon = "com.texnomart.app:id/btnAddToCard";
    private final String cartMenu = "com.texnomart.app:id/navigation_cart";
    private final String creditInput = "com.texnomart.app:id/tvrassrochka";
    public AndroidDriver<AndroidElement> driver;

    public ProductElements(AndroidDriver driver) {
        this.driver = driver;
    }

    public AndroidElement clickProInfo() {
        return driver.findElement(By.xpath(proInfo));
    }

    public AndroidElement clickBackIcon() {
        return driver.findElement(By.id(backIcon));
    }

    public AndroidElement searchInputType() {
        return driver.findElement(By.id(searchInput));
    }
    public AndroidElement newElementClick(){
        return driver.findElement(By.xpath(elementClick));
    }
    public AndroidElement clickCatalog(){
        return driver.findElement(By.id(catalog));
    }
    public AndroidElement clickSubCatalog(){
        return driver.findElement(By.xpath(subCatalog));
    }
    public AndroidElement clickSubInCatalog(){
        return driver.findElement(By.xpath(subInCatalog));
    }
    public AndroidElement clickSortIcon(){
        return driver.findElement(By.id(sortIcon));
    }
    public AndroidElement clickCheckbox(){
        return driver.findElement(By.xpath(expensiveCheck));
    }
    public AndroidElement clickProfile(){
        return driver.findElement(By.id(profile));
    }
    public AndroidElement clickFirstInput(){
        return driver.findElement(By.xpath(firstInput));
    }
    public AndroidElement clickFavoriteProduct(){
        return driver.findElement(By.xpath(favoriteProduct));
    }
    public AndroidElement clickCartIcon(){
        return driver.findElement(By.id(cartIcon));
    }
    public AndroidElement clickCartMenu(){
        return driver.findElement(By.id(cartMenu));
    }
    public AndroidElement clickCreditInput(){
        return driver.findElement(By.id(creditInput));
    }



}
