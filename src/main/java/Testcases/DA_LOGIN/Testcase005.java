package Testcases.DA_LOGIN;

import DataObjects.User;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase005 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase005.class);
    @Test(description = "Verify that there is no Login dialog when switching between 2 repositories with the same account")
    public void TC005() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        User user = new User("administrator", "");

        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Change to repository name: WebRepository");

        dashboardPage.moveToRepository();
        dashboardPage.clickWebRepository();
        Thread.sleep(500);
        logger.info(loginPage.getNameRepository());

        Assert.assertEquals(loginPage.getNameRepository(), "WebRepository");
    }

}
