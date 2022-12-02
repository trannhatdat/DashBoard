package Testcases.DA_DP;

import Common.DriverManager;
import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase084 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase084.class);
    @Test
    public void TC084() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");

        logger.info("Verify that Check All / Uncheck All Links are working correctly");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        loginPage.moveToAdminister();
        loginPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Input Profile Name and click Next for navigate to Sort Fields Page");
        createProfilePage.inputProfileName("Test Data Profile");
        createProfilePage.clickNext();
        Thread.sleep(500);
        createProfilePage.clickNext();
        logger.info("Select 'Name' item");
        createProfilePage.selectSortField("Name");
        createProfilePage.clickAddLevel();
        logger.info("Select 'Name' item and click 'Add Level' button again");
        createProfilePage.selectSortField("Name");
        createProfilePage.clickAddLevel();

        Assert.assertEquals(DriverManager.getAlertMsg(), "Field 'Name' already selected");
    }
}
