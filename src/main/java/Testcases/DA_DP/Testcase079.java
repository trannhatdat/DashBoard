package Testcases.DA_DP;

import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DashboardPage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.annotations.Test;

public class Testcase079 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase079.class);
    @Test
    public void TC079() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");

        logger.info("Verify that Check All / Uncheck All Links are working correctly");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        dashboardPage.moveToAdminister();
        dashboardPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Input Profile Name and click Next");
        createProfilePage.inputProfileName("Test Data Profile");
        createProfilePage.clickNext();
        logger.info("Click on Check all and Uncheck All button and see the observe");
        createProfilePage.clickCheckAll();
        Thread.sleep(2000);
        createProfilePage.clickUncheckAll();
        Thread.sleep(2000);
    }
}
