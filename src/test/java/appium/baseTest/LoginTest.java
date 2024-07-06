package appium.baseTest;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
    static AndroidDriver driver;
    @BeforeTest
    public static void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:platformVersion","11.0");
        capabilities.setCapability("appium:deviceName","emulator-5554");
        capabilities.setCapability("appium:app","C:/Users/Windows/Downloads/challenge-8.apk");
        capabilities.setCapability("appium:automationName","UIAutomator2");
        capabilities.setCapability("appium:appPackage","com.swaglabsmobileapp");
        capabilities.setCapability("appium:appActivity","com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(capabilities);

    }
    @Test
    public static void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickloginButton();


        // assertion
        HomePage homePage = new HomePage(driver);
        homePage.textProductisDisplayed();
    }
    @AfterTest
    public static void closeSession(){
        if(driver != null){
            driver.quit();
        }

    }
    public static void resetApp() {
        driver.terminateApp("com.swaglabsmobileapp");
        driver.activateApp("com.swaglabsmobileapp");
    }
}
