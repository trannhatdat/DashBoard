package PageObjects;

import Common.Constant;
import Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GeneralPage {
    //Locators
    private final By tabOverview = By.xpath("//a[@href='/TADashboard/2f9njfdusj.page']");
    private final By tabExecutionDashboard = By.xpath("//a[@href='/TADashboard/2f9njff6y9.page']");
    private final By ddbChoosePanel = By.xpath("//a[@id='btnChoosepanel']");
    private final By ddbGlobalSetting = By.xpath("//li[@class='mn-setting']");
    private final By btnAddPage = By.xpath("//a[text()='Add Page']");
    private final By btnCreateProfile = By.xpath("//a[text()='Create Profile']");
    private final By btnCreatePanel = By.xpath("//a[text()='Create Panel']");
    private final By btnEdit = By.xpath("//a[@class='edit']");
    private final By btnDelete = By.xpath("//a[@class='delete']");
    private final By ddbWelcome = By.xpath("//a[@href='#Welcome']");
    private final By btnMyProfile = By.xpath("//a[text()='My Profile']");
    private final By btnLogout = By.xpath("//a[text()='Logout']");
    private final By ddbRepository = By.xpath("//a[@href='#Repository']");
    private final By btnWebRepository = By.xpath("//a[text()='WebRepository']");
    private final By lblRepository = By.xpath("//a[@href='#Repository']/span");
    private final By ddbAdminister = By.xpath("//a[@href='#Administer']");
    private final By btnDataProfiles = By.xpath("//a[text()='Data Profiles']");
    private final By btnPanels = By.xpath("//a[text()='Panels']");
    private final By btnHelp = By.xpath("//a[@href='help/Topics/Dashboard.html']");
    private final By btnLabManager = By.xpath("//li[@class='hasbg h-lab']/a");
    private final By listPage = By.xpath("//li[@class='mn-panels']/preceding-sibling::li/a");

    //Elements
    protected WebElement getTabOverView() {
        return Constant.WEBDRIVER.findElement(tabOverview);
    }

    protected WebElement getTabExecutionDashboard() {
        return Constant.WEBDRIVER.findElement(tabExecutionDashboard);
    }

    protected WebElement getDdbChoosePanel() {
        return Constant.WEBDRIVER.findElement(ddbChoosePanel);
    }

    protected WebElement getDdbGlobalSetting() {
        return Constant.WEBDRIVER.findElement(ddbGlobalSetting);
    }

    protected WebElement getBtnAddPage() {
        return Constant.WEBDRIVER.findElement(btnAddPage);
    }

    protected WebElement getBtnCreateProfile() {
        return Constant.WEBDRIVER.findElement(btnCreateProfile);
    }

    protected WebElement getBtnCreatePanel() {
        return Constant.WEBDRIVER.findElement(btnCreatePanel);
    }

    protected WebElement getBtnEdit() {
        return Constant.WEBDRIVER.findElement(btnEdit);
    }

    protected WebElement getBtnDelete() {
        return Constant.WEBDRIVER.findElement(btnDelete);
    }

    protected WebElement getDdbWelcome() {
        return Constant.WEBDRIVER.findElement(ddbWelcome);
    }

    protected WebElement getBtnMyProfile() {
        return Constant.WEBDRIVER.findElement(btnMyProfile);
    }

    protected WebElement getBtnLogout() {
        return Constant.WEBDRIVER.findElement(btnLogout);
    }

    protected WebElement getDdbRepository() {
        return Constant.WEBDRIVER.findElement(ddbRepository);
    }

    protected WebElement getBtnWebRepository() {
        return Constant.WEBDRIVER.findElement(btnWebRepository);
    }

    protected WebElement getLblRepository() {
        return Constant.WEBDRIVER.findElement(lblRepository);
    }

    protected WebElement getDdbAdminister() {
        return Constant.WEBDRIVER.findElement(ddbAdminister);
    }

    protected WebElement getBtnDataProfiles() {
        return Constant.WEBDRIVER.findElement(btnDataProfiles);
    }

    protected WebElement getBtnPanels() {
        return Constant.WEBDRIVER.findElement(btnPanels);
    }

    protected WebElement getBtnHelp() {
        return Constant.WEBDRIVER.findElement(btnHelp);
    }

    protected WebElement getBtnLabManager() {
        return Constant.WEBDRIVER.findElement(btnLabManager);
    }

    protected List<WebElement> getListPage() {
        return Constant.WEBDRIVER.findElements(listPage);
    }

    //Methods
    public void gotoOverView() {
        getTabOverView().click();
    }

    public void gotoExecutionDashboard() {
        getTabExecutionDashboard().click();
    }

    public void clickChoosePanel() {
        getDdbChoosePanel().click();
    }

    public void clickGlobalSetting() {
        getDdbGlobalSetting().click();
    }

    public void clickAddPage() {
        getBtnAddPage().click();
    }

    public void clickCreateProfile() {
        getBtnCreateProfile().click();
    }

    public void clickCreatePanel() {
        getBtnCreatePanel().click();
    }

    public void clickEdit() {
        getBtnEdit().click();
    }

    public void clickDelete() {
        getBtnDelete().click();
    }

    public void moveToWelcome() {
        getDdbWelcome().click();
    }

    public void clickMyProfile() {
        getBtnMyProfile().click();
    }

    public void logout() {
        getBtnLogout().click();
    }

    public void moveToRepository() {
        getDdbRepository().click();
    }

    public void clickWebRepository() {
        getBtnWebRepository().click();
    }

    public String getNameRepository() {
        return getLblRepository().getText();
    }

    public void moveToAdminister() {
        getDdbAdminister().click();
    }

    public void clickDataProfiles() {
        getBtnDataProfiles().click();
    }

    public void clickPanels() {
        getBtnPanels().click();
    }

    public void clickHelp() {
        getBtnHelp().click();
    }

    public void clickLabManager() {
        getBtnLabManager().click();
    }

    public void showListPage() {
        getListPage().stream().forEach(e -> {
            System.out.print("| " + e.getText() + " |");
        });
    }
}
