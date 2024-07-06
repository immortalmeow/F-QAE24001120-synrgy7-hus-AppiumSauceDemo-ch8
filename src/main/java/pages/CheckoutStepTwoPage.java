package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStepTwoPage {
    AndroidDriver driver;
    WebDriverWait wait;

    public CheckoutStepTwoPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //Locator atau element
    By firstnameField = AppiumBy.accessibilityId("test-First Name");
    By lastnameField = AppiumBy.accessibilityId("test-Last Name");
    By zipcodeField = AppiumBy.accessibilityId("test-Zip/Postal Code");
    By continueButton = AppiumBy.accessibilityId("test-CONTINUE");

    //Action methd
    public void inputFirstname(String firstname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstnameField)).sendKeys(firstname);
    }
    public void inputLastname(String lastname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastnameField)).sendKeys(lastname);
    }
    public void inputZipcode(String zipcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipcodeField)).sendKeys(zipcode);
    }
    public void clickContinuebutton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton)).click();
    }
}
