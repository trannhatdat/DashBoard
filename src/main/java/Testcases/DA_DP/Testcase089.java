package Testcases.DA_DP;

import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DashboardPage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Testcase089 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase089.class);
    @Test(description = "Verify that there displays \"Recommended Value\" dropped down menu on expanded mode under \"Value\" field when this field is on focused ")
    public void TC089() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");

        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        dashboardPage.moveToAdminister();
        dashboardPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Input Profile Name and click Next for navigate to Filter Fields Page");
        createProfilePage.inputProfileName("Test Data Profile");
        createProfilePage.clickNext();
        Thread.sleep(500);
        createProfilePage.clickNext();
        Thread.sleep(500);
        createProfilePage.clickNext();
        Thread.sleep(2000);
    }
}
