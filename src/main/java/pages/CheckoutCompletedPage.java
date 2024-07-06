package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletedPage {
    AndroidDriver driver;
    WebDriverWait wait;
    public CheckoutCompletedPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //locator atau element
    By checkoutcompletedText = By.xpath("//*[contains(@text, 'CHECKOUT: COMPLETE!')]");
    By tyorderText = By.xpath("//*[contains(@text, 'THANK YOU FOR YOU ORDER')]");
    By yourorderblablaText = By.xpath("//*[contains(@text, 'Your order has been dispatched, and will arrive just as fast as the pony can get there!')]");

    //Action method
    public void checkouttextisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutcompletedText)).isDisplayed();
    }
    public void tyordertextisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(tyorderText)).isDisplayed();
    }
    public void yourorderTextisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(yourorderblablaText)).isDisplayed();
    }
}
