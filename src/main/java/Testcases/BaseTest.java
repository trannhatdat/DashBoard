package Testcases;

import Common.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(String browser) {
        System.out.println("Pre-condition");
        DriverManager.getBrowserDriver(browser);
        DriverManager.maximizedWindow();
        DriverManager.open();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-condition");
        DriverManager.quitDriver();
    }
}
