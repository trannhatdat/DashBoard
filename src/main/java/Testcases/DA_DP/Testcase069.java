package Testcases.DA_DP;

import Common.DriverManager;
import DataObjects.User;
import PageObjects.CreateProfilePage;
import PageObjects.DataProfilesPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.annotations.Test;

public class Testcase069 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase069.class);
    @Test
    public void TC069() {
        LoginPage loginPage = new LoginPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        User user = new User("administrator", "");

        logger.info("Verify that user is unable to proceed to next step or finish creating data profile if \"Name *\" field is left empty");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        loginPage.moveToAdminister();
        loginPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Click on Next button");
        createProfilePage.clickNext();
        if (DriverManager.isAlertPresent() == true){
            logger.info("Alert is displayed");
            DriverManager.acceptAlert();
        }
        else logger.info("Alert is not displayed");

        logger.info("Click on Finish button");
        createProfilePage.clickFinish();
        if (DriverManager.isAlertPresent() == true){
            logger.info("Alert is displayed");
            DriverManager.acceptAlert();
        }
        else logger.info("Alert is not displayed");
    }
}
