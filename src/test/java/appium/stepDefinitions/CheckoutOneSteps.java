package appium.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import pages.CheckoutStepOnePage;

public class CheckoutOneSteps {

    AndroidDriver driver;
    CheckoutStepOnePage checkoutOne = new CheckoutStepOnePage(driver);

    @And("User click checkout button")
    public void UserclickchekoutButton(){
        checkoutOne.swipeToElementWithText("CHECKOUT");
        checkoutOne.clickcheckoutButton();
    }
}
