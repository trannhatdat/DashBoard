package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewPanelPopupPage extends GeneralPage {
    //Locator
    private final By lnkAddNew = By.xpath("//a[.='Add New']");
    private final By txtDisplayName = By.xpath("//input[@id='txtDisplayName']");
    private final By ddlSeriesFiled = By.xpath("//select[@id='cbbSeriesField']");
    private final By btnOk = By.xpath("//input[@id='OK']");
    private final By btnCancel = By.xpath("//input[@id='Cancel']");

    //Elements
    private WebElement getLnkAddNew() {
        return Constant.WEBDRIVER.findElement(lnkAddNew);
    }

    private WebElement getTxtDisplayName() {
        return Constant.WEBDRIVER.findElement(txtDisplayName);
    }

    private WebElement getDdlSeriesField() {
        return Constant.WEBDRIVER.findElement(ddlSeriesFiled);
    }

    private WebElement getBtnOk() {
        return Constant.WEBDRIVER.findElement(btnOk);
    }

    private WebElement getBtnCancel() {
        return Constant.WEBDRIVER.findElement(btnCancel);
    }

    //Methods
    public void addNewPanel(String displayName,String valueSeries) {
        moveToAdminister();
        clickPanels();
        getLnkAddNew().click();
        getTxtDisplayName().sendKeys(displayName);
        Select selectSeries = new Select(getDdlSeriesField());
        selectSeries.selectByIndex(1);
        getBtnOk().click();
    }
}
