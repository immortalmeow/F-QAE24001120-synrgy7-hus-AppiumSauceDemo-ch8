package appium.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.CheckoutCompletedPage;

public class CompletedSteps {
    AndroidDriver driver;
    CheckoutCompletedPage completedPage = new CheckoutCompletedPage(driver);

    @Then("User on finish payment page")
    public void useronFinishPaymentPage(){
        completedPage.yourorderTextisDisplayed();
        completedPage.tyordertextisDisplayed();
        completedPage.checkouttextisDisplayed();
    }
}
