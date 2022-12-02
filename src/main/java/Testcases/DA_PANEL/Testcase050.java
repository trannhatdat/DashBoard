package Testcases.DA_PANEL;

import DataObjects.User;
import PageObjects.CreatePanelPopup;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Testcase050 extends BaseTest {
    private static final Logger logger = LogManager.getLogger(Testcase050.class);
    @Test(description = "Verify that user is able to successfully edit \"Display Name\" of any Panel providing that the name is not duplicated with existing Panels'")
    public void DA_PANEL_TC050(){
        Logger logger = LogManager.getLogger();
        LoginPage loginPage = new LoginPage();
        User user = new User("test", "test");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);

        CreatePanelPopup addNewPanelPopup = new CreatePanelPopup();
        addNewPanelPopup.addNewPanel("Logigear","Name");
    }
}
