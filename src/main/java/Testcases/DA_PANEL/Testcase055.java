package Testcases.DA_PANEL;

import DataObjects.AddPage;
import DataObjects.User;
import PageObjects.*;
import Testcases.BaseTest;
import org.testng.Assert;
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

        logger.info("Add new page");
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickGlobalSetting();
        dashboardPage.clickAddPage();
        AddPage addPage = new AddPage("Page 5", "Select parent", "2", "Overview");
        AddPagePopup addPagePopup = new AddPagePopup();
        addPagePopup.addNewPage(addPage);

        Thread.sleep(500);
        logger.info("Add new panel");
        addPagePopup.clickGlobalSetting();
        CreatePanelPopup createPanelPopup = new CreatePanelPopup();
        createPanelPopup.addNewPanel("Logigear");

        PanelConfigrution panelConfigrution = new PanelConfigrution();
        panelConfigrution.clickBtnOK();
        Pages pages = new Pages();
        pages.clickBtnEdit();
        EditPanelPopup editPanelPopup = new EditPanelPopup();
        editPanelPopup.sendkeyTxtFolder();
        editPanelPopup.clickBtnOK();

    }
}
