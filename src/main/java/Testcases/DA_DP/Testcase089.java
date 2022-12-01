package Testcases.DA_DP;

import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.annotations.Test;

public class Testcase089 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase089.class);
    @Test
    public void TC089() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");

        logger.info("Verify that there displays \"Recommended Value\" dropped down menu on expanded mode under \"Value\" field when this field is on focused ");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        loginPage.moveToAdminister();
        loginPage.clickDataProfiles();
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
