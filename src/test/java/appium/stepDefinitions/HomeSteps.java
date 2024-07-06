package appium.stepDefinitions;

import appium.baseTest.LoginTest;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeSteps extends LoginTest {
    AndroidDriver driver;
    HomePage homePage = new HomePage(driver);

    @Then("user is on homepage")
    public void userIsOnHomepage(){
        homePage.validateOnPage();
    }

    @When("User click the Low to High Button")
    public void userClicktheHightoLowButton(){
        homePage.clickSortingButton();
        homePage.clicklowtohighButton();
    }

    @Then("User on Low to High product homepage")
    public void userAlreadyOnLtHHomepage(){
        homePage.onesietextisDisplayed();
        homePage.bikelighttextisDisplayed();

    }

    @And("User add to cart 2 produts")
    public void userAddtoCart2Products(){
        homePage.clickbikelightAddtocartButton();
        homePage.clickbackpackAddtocartButton();
        homePage.clickCartButton();
    }



}
