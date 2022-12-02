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
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase094 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase094.class);

    @Test(description = "Verify that there displays \"Recommended Value\" dropped down menu on expanded mode under \"Value\" field when this field is on focused ")
    public void TC094() throws InterruptedException {
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
        createProfilePage.inputProfileName("Test Data Profile");
        createProfilePage.clickNext();
        Thread.sleep(500);
        createProfilePage.clickNext();
        Thread.sleep(500);
        createProfilePage.clickNext();

        logger.info("Add a Filter Criteria");
        createProfilePage.AddFilterCriteria(fc);
        String expectedCriteria = fc.getField()  + fc.getOperator() + "\"" + fc.getValue() + "\"";
        String observedCriteria = createProfilePage.getFilterCriteria();

        Assert.assertEquals(expectedCriteria, observedCriteria, "Filter Criteria is not correctly");
    }
}
