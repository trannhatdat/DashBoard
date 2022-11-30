package Testcases.DA_MP;

import DataObjects.AddPage;
import DataObjects.User;
import PageObjects.AddPagePopup;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import Testcases.DA_LOGIN.Testcase010;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Testcase025 extends BaseTest {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(Testcase025.class);
    @Test
    public void TC025() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        AddPagePopup addPage = new AddPagePopup();
        User user = new User("administrator","");

        logger.info("Verify that page listing is correct when user edit \"Display After\" field of a specific page");
        logger.info("Navigate to Dashboard login page and login with 'administrator' username");
        loginPage.login(user);
        logger.info("Create Page 1");
        loginPage.clickGlobalSetting();
        loginPage.clickAddPage();
        AddPage page1 = new AddPage("Page 1", "Select parent", "2", "Overview");
        addPage.addNewPage(page1);
        Thread.sleep(500);

        logger.info("Create Page 2");
        loginPage.clickGlobalSetting();
        loginPage.clickAddPage();
        AddPage page2 = new AddPage("Page 2", "Select parent", "2", "Page 1");
        addPage.addNewPage(page2);
        Thread.sleep(500);

        logger.info("List Page display before edit");
        loginPage.showListPage();
        loginPage.clickGlobalSetting();
        loginPage.clickEdit();
        addPage.selectDisplayAfter("Overview");
        addPage.clickOK();
        Thread.sleep(500);
        logger.info("List Page display before edit");
        loginPage.showListPage();
    }
}
