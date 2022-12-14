package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatePanelPopup extends GeneralPage {
    //Locator
    private final By lnkAddNew = By.xpath("//a[.='Add New']");
    private final By txtDisplayName = By.xpath("//input[@id='txtDisplayName']");
    private final By ddlSeriesFiled = By.xpath("//select[@id='cbbSeriesField']");
    private final By btnOk = By.xpath("//input[@id='OK']");
    private final By btnCancel = By.xpath("//input[@id='Cancel']");
    private final By lnkEdit = By.xpath("//td[@class='center']/a[text()='Edit']");
    private String lnkListPanel ="//tbody//a[text()='%s']";
    private final By lnkCreatePanel = By.xpath("//a[text()='Create Panel']");

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

    private WebElement getLnkEdit() {
        return Constant.WEBDRIVER.findElement(lnkEdit);
    }
    private WebElement getLnkListPanel(String value){
        return Constant.WEBDRIVER.findElement(By.xpath(String.format(lnkListPanel,value)));
    }
    private WebElement getLnkCreatePanel(){
        return Constant.WEBDRIVER.findElement(lnkCreatePanel);
    }
    //Methods
    public void sendKeyDisplayName(String displayName) {
        getTxtDisplayName().sendKeys(displayName);
    }

    public void addNewPanel(String displayName) {
        sendKeyDisplayName(displayName);
        Select selectSeries = new Select(getDdlSeriesField());
        selectSeries.selectByIndex(1);
        getBtnOk().click();
    }

    public void editPanel() {
        getLnkEdit().click();
        sendKeyDisplayName("Logigear!#$%");
        getBtnOk().click();
    }
    public String getTextListPanel(String value){
        return getLnkListPanel(value).getText();
    }
    public void clickCreatePanel(){
        getLnkCreatePanel().click();
    }
}
