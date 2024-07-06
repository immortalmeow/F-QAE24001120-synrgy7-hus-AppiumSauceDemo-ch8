package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.channels.WritableByteChannel;
import java.time.Duration;

public class PaymentPage {
    AndroidDriver driver;
    WebDriverWait wait;
    public PaymentPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //Locator atau element
    By finishButton = AppiumBy.accessibilityId("test-FINISH");

    //Action methd
    public void clickfinishButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton)).click();
    }
    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
                                text)));
    }

}

