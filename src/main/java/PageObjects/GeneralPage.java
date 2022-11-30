package PageObjects;

import Common.Constant;
import Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    //Locators
    private final By tabOverview = By.xpath("//a[@href='/TADashboard/2f9njfdusj.page']");
    private final By tabExecutionDashboard = By.xpath("//a[@href='/TADashboard/2f9njff6y9.page']");
    private final By ddbChoosePanel = By.xpath("//a[@id='btnChoosepanel']");
    private final By ddbGlobalSetting = By.xpath("//li[@class='mn-setting']");
    private final By ddbWelcome = By.xpath("//a[@href='#Welcome']");
    private final By ddbRepository = By.xpath("//a[@href='#Repository']");
    private final By btnWebRepository = By.xpath("//a[text()='WebRepository']");
    private final By lblRepository = By.xpath("//a[@href='#Repository']/span");
    private final By ddbAdminister = By.xpath("//a[@href='#Administer']");
    private final By btnAddPage = By.xpath("//a[text()='Add Page']");

    //Elements
    protected WebElement getDdbRepository() {
        return Constant.WEBDRIVER.findElement(ddbRepository);
    }

    protected WebElement getBtnWebRepository() {
        return Constant.WEBDRIVER.findElement(btnWebRepository);
    }

    protected WebElement getLblRepository() {
        return Constant.WEBDRIVER.findElement(lblRepository);
    }

    //Methods
    public void moveToRepository() {
        this.getDdbRepository().click();
    }

    public void clickWebRepository() {
        this.getBtnWebRepository().click();
    }

    public String getNameRepository() {
        return this.getLblRepository().getText();
    }
}
