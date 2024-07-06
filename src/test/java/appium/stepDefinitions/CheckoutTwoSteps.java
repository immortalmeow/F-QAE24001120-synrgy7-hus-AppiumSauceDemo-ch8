package appium.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import pages.CheckoutStepTwoPage;

public class CheckoutTwoSteps {
    AndroidDriver driver;
    CheckoutStepTwoPage checkoutTwo = new CheckoutStepTwoPage(driver);

    @And("User input Firstname, Lastname, and Zipcode")
    public void userInputFirstnameLastnameZipcode(){
        checkoutTwo.inputFirstname("Kobra");
        checkoutTwo.inputLastname("Hitam");
        checkoutTwo.clickContinuebutton();
    }
}
