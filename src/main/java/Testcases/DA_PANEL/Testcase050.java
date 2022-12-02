package Testcases.DA_PANEL;

import DataObjects.User;
import PageObjects.CreatePanelPopup;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase050 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase050.class);

    @Test(description = "Verify that user is able to successfully edit \"Display Name\" of any Panel providing that the name is not duplicated with existing Panels'")
    public void DA_PANEL_TC050() {
        LoginPage loginPage = new LoginPage();
        User user = new User("administrator", "");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        CreatePanelPopup addNewPanelPopup = new CreatePanelPopup();
        addNewPanelPopup.addNewPanel("Logigear");
        logger.info("Click add new link");
        logger.info("Enter a valid name into Display Name field");
        Assert.assertEquals("Logigear", addNewPanelPopup.getTextListPanel("Logigear"));
    }
}
