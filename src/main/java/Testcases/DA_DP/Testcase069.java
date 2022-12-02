package Testcases.DA_DP;

import Common.DriverManager;
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

public class Testcase069 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase069.class);
    @Test(description = "Verify that user is unable to proceed to next step or finish creating data profile if \"Name *\" field is left empty")
    public void TC069() {
        LoginPage loginPage = new LoginPage();
        DataProfilesPage dataProfilesPage = new DataProfilesPage();
        DashboardPage dashboardPage = new DashboardPage();
        CreateProfilePage createProfilePage = new CreateProfilePage();
        String alert1, alert2;
        User user = new User("administrator", "");

        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Navigate to Data Profiles page and click Add New link");
        dashboardPage.moveToAdminister();
        dashboardPage.clickDataProfiles();
        dataProfilesPage.clickAddNewProfile();

        logger.info("Click on Next button");
        createProfilePage.clickNext();
        if (DriverManager.isAlertPresent() == true){
            alert1 = "Alert is displayed";
            DriverManager.acceptAlert();
        }
        else alert1 = "Alert is not displayed";

        logger.info("Click on Finish button");
        createProfilePage.clickFinish();
        if (DriverManager.isAlertPresent() == true){
            alert2 = "Alert is displayed";
            DriverManager.acceptAlert();
        }
        else alert2 = "Alert is not displayed";

        Assert.assertEquals(alert1, "Alert is displayed", "Alert is not displayed");
        Assert.assertEquals(alert2, "Alert is displayed", "Alert is not displayed");
    }
}
