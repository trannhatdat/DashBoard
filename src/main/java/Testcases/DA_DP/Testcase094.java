package Testcases.DA_DP;

import DataObjects.FilterCriteria;
import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase094 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase094.class);

    @Test
    public void TC094() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");
        FilterCriteria fc = new FilterCriteria("and", "Recent result", "=", "failed");

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

        logger.info("Add a Filter Criteria");
        createProfilePage.AddFilterCriteria(fc);
        String expectedCriteria = fc.getField()  + fc.getOperator() + "\"" + fc.getValue() + "\"";
        String observedCriteria = createProfilePage.getFilterCriteria();

        Assert.assertEquals(expectedCriteria, observedCriteria, "Filter Criteria is not correctly");
    }
}
