package Testcases.DA_PANEL;

import DataObjects.AddPage;
import DataObjects.User;
import PageObjects.AddNewPanelPopupPage;
import PageObjects.AddPagePopup;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase055 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase055.class);
    @Test
    public void DA_PANEL_TC055() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        User user = new User("administrator", "");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        loginPage.clickGlobalSetting();
        loginPage.clickAddPage();
        AddPage addPage = new AddPage("Page 5","Select parent","2","Overview");
        AddPagePopup addPagePopup = new AddPagePopup();
        addPagePopup.addNewPage(addPage);
        Thread.sleep(500);
        addPagePopup.clickGlobalSetting();
        AddNewPanelPopupPage addNewPanelPopup = new AddNewPanelPopupPage();
        addNewPanelPopup.addNewPanel("Logigear2");
        
    }
}
