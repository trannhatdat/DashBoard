package Testcases.DA_LOGIN;

import Common.DriverManager;
import DataObjects.User;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase010 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase010.class);

    @Test(description = "Verify that the page works correctly for the case when no input entered to Password and Username field")
    public void TC010() {
        LoginPage loginPage = new LoginPage();
        logger.info("TC 010");
        User user = new User("", "");
        logger.info("Login with blank username and password");
        loginPage.login(user);
        Assert.assertTrue(DriverManager.isAlertPresent());
    }
}
