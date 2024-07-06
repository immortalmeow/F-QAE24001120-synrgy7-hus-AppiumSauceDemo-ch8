package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    AndroidDriver driver;
    WebDriverWait wait;

    public  HomePage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // lOCATOR AND ELEMENT
    By textProducts = By.xpath("//*[contains(@text, 'PRODUCTS')]");
    By sortingButton = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(5)");
    By lowtohighButton = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(11)");
    By onesieText = By.xpath("//*[contains(@text, 'Sauce Labs Onesie')]");
    By bikelightText = By.xpath("//*[contains(@text, 'Sauce Labs Bike Light')]");
    By backpackAddtocartButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"ADD TO CART\").instance(0)");
    By bikelightAddtocartButton = By.xpath("//*[contains(@text, 'ADD TO CART')]");
    By cartButton = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)");


    // ACTION METHOD
    public void textProductisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textProducts)).isDisplayed();
    }
    public void clickSortingButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortingButton)).click();
    }
    public void clicklowtohighButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lowtohighButton)).click();
    }
    public void onesietextisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(onesieText)).isDisplayed();
    }
    public void bikelighttextisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(bikelightText)).isDisplayed();
    }
    public void clickbackpackAddtocartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(backpackAddtocartButton)).click();
    }
    public void clickbikelightAddtocartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(bikelightAddtocartButton)).click();
    }
    public void clickCartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton)).click();
    }
    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(textProducts));
        wait.until(ExpectedConditions.presenceOfElementLocated(cartButton));
    }

}
