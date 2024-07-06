package appium.stepDefinitions;

import appium.baseTest.LoginTest;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends LoginTest {
    AndroidDriver driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on login page")
    public void userInOnLoginPage(){
        loginPage.validateOnPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }
    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickloginButton();
    }

    @Then("login page showed error text")
    public void loginPageShowErrorText(){loginPage.errortextisDisplayed();}

    @Given("User already in home page")
    public void userAlreadyInHomepage(){
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickloginButton();
    }



}
