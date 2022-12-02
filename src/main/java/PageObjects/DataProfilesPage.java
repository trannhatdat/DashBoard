package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataProfilesPage extends GeneralPage{
    //Locators
    private final By btnAddNew = By.xpath("//a[@href='profile.jsp?action=create' and text()='Add New']");
    private final By btnDelete = By.xpath("//a[@href='javascript:Dashboard.deleteProfiles();']");

    //Elements
    private WebElement getBtnAddNewProfile() {
        return Constant.WEBDRIVER.findElement(btnAddNew);
    }

    private WebElement getBtnDeleteProfile() {
        return Constant.WEBDRIVER.findElement(btnDelete);
    }

    //Methods
    public void clickAddNewProfile() {
        getBtnAddNewProfile().click();
    }

    public void clickDeleteProfile() {
        getBtnDeleteProfile().click();
    }
}
