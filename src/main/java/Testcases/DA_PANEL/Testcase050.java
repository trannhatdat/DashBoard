package Testcases.DA_PANEL;

import DataObjects.User;
import PageObjects.AddNewPanelPopup;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Testcase050 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase050.class);
    @Test
    public void DA_PANEL_TC050(){
        Logger logger = LogManager.getLogger();
        LoginPage loginPage = new LoginPage();
        User user = new User("test", "test");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);

        AddNewPanelPopup addNewPanelPopup = new AddNewPanelPopup();
        addNewPanelPopup.addNewPanel("Logigear","Name");
        
    }
}
