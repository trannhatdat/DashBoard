package Testcases.DA_LOGIN;

import DataObjects.User;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Testcase005 extends BaseTest {
    @Test
    public void TC005() {
        Logger logger = LogManager.getLogger();
        LoginPage loginPage = new LoginPage();
        User user = new User("administrator","");

        logger.info("Verify that there is no Login dialog when switching between 2 repositories with the same account");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user, "SampleRepository");
    }

}
