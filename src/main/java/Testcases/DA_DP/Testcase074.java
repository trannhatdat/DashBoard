package Testcases.DA_DP;

import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.annotations.Test;


public class Testcase074 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase074.class);
    @Test
    public void TC074() {
        LoginPage loginPage = new LoginPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");

        logger.info("Verify that appropriate \"Related Data\" items are listed correctly corresponding to the \"Item Type\" items.");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        loginPage.moveToAdminister();
        loginPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Select each Item Type and show obsever");
        createProfilePage.selectAndShowEachItemType();
    }
}
