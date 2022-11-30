package Testcases.DA_LOGIN;

import Common.DriverManager;
import DataObjects.User;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase005 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase005.class);
    @Test
    public void TC005() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        User user = new User("administrator", "");

        logger.info("Verify that there is no Login dialog when switching between 2 repositories with the same account");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Change to repository name: WebRepository");

        loginPage.moveToRepository();
        loginPage.clickWebRepository();
        Thread.sleep(500);
        logger.info(loginPage.getNameRepository());

        Assert.assertEquals(loginPage.getNameRepository(), "WebRepository");
    }

}
