package appium.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.When;
import pages.PaymentPage;

public class PaymentSteps {
    AndroidDriver driver;
    PaymentPage paymentPage = new PaymentPage(driver);

    @When("User click finish button")
    public void userClickFinishButton(){
        paymentPage.swipeToElementWithText("FINISH");
        paymentPage.clickfinishButton();
    }
}
