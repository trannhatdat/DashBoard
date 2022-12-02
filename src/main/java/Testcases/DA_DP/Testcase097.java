package Testcases.DA_DP;

import DataObjects.FilterCriteria;
import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DashboardPage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Testcase097 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase097.class);
    @Test(description = "Verify that all settings are recorded and updated correctly when user click on \"Finish\" buttons")
    public void TC097() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");
        FilterCriteria fc = new FilterCriteria("and", "Recent result", "=", "failed");

        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        dashboardPage.moveToAdminister();
        dashboardPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Input Profile Name and click Next for navigate to Filter Fields Page");
        createProfilePage.inputProfileName("Test 1");
        createProfilePage.clickNext();
        Thread.sleep(500);

        logger.info("Check 'Name' checkbox and click Next button");
        createProfilePage.checkCheckBox("name");
        createProfilePage.clickNext();
        Thread.sleep(500);

        logger.info("Select \"Name\" in Field dropped down menu and click Next button");
        createProfilePage.selectSortField("Name");
        createProfilePage.clickNext();
        Thread.sleep(500);

        logger.info("Add a filter criteria and click Next button");
        createProfilePage.AddFilterCriteria(fc);
        createProfilePage.clickNext();
        Thread.sleep(500);

        logger.info("Check 'Name' checkbox and click Finish button");
        createProfilePage.checkCheckBox("name");
        createProfilePage.clickFinish();
    }
}
