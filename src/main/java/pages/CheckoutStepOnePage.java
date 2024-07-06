package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStepOnePage {
    AndroidDriver driver;
    WebDriverWait wait;

    public CheckoutStepOnePage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Locator atau element
    By checkoutButton = AppiumBy.accessibilityId("test-CHECKOUT");

    //Action method
    public void clickcheckoutButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton)).click();
    }
    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
                                text)));
    }

}
