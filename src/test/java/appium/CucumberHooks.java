package appium;

import appium.baseTest.LoginTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {
    @BeforeAll
    public static void beforeAll() {
        LoginTest.setUp();
    }

    @AfterAll
    public static void afterAll() {
        LoginTest.closeSession();
    }

    @After
    public static void after() {
        LoginTest.resetApp();
    }
}
