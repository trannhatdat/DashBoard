package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateProfilePage extends GeneralPage {
    //Locators
    private final By txtProfileName = By.xpath("//input[@id='txtProfileName']");
    private final By sltItemType = By.xpath("//select[@id='cbbEntityType']");
    private final By sltRelatedData = By.xpath("//select[@id='cbbSubReport']");
    private final By btnNext = By.xpath("//input[@value='Next']");
    private final By btnFinish = By.xpath("//input[@value='Finish']");
    private final By btnCancel = By.xpath("//input[@value='Cancel']");
    private final By btnBack = By.xpath("//input[@value='Back']");
    private final By btnCheckAll = By.xpath("//a[text()='Check All']");
    private final By btnUncheckAll = By.xpath("//a[text()='Uncheck All']");
    private final By sltSortField = By.xpath("//select[@id='cbbFields']");
    private final By btnAddLevel = By.xpath("//input[@value='Add Level']");
    private final By sltAndOr = By.xpath("//select[@id='cbbAndOrCondition']");
    private final By sltFilterField = By.xpath("//select[@id='cbbField']");
    private final By sltOperator = By.xpath("//select[@id='cbbCondition']");
    private final By txtValue = By.xpath("//input[@id='txtSearchText']");
    private final By btnAdd = By.xpath("//button[@title='Add condition']");
    private final By btnRemove = By.xpath("//button[@title='Remove condition']");
    private final By chbName = By.xpath("//input[@type='checkbox' and @value='name']");

    //Elements
    private WebElement getTxtProfileName() {
        return Constant.WEBDRIVER.findElement(txtProfileName);
    }

    private WebElement getSltItemType() {
        return Constant.WEBDRIVER.findElement(sltItemType);
    }

    private WebElement getSltRelatedData() {
        return Constant.WEBDRIVER.findElement(sltRelatedData);
    }

    private WebElement getBtnNext() {
        return Constant.WEBDRIVER.findElement(btnNext);
    }

    private WebElement getBtnFinish() {
        return Constant.WEBDRIVER.findElement(btnFinish);
    }

    private WebElement getBtnCancel() {
        return Constant.WEBDRIVER.findElement(btnCancel);
    }

    private WebElement getBtnBack() {
        return Constant.WEBDRIVER.findElement(btnBack);
    }

    private WebElement getBtnCheckAll() {
        return Constant.WEBDRIVER.findElement(btnCheckAll);
    }

    private WebElement getBtnUncheckAll() {
        return Constant.WEBDRIVER.findElement(btnUncheckAll);
    }

    private WebElement getSltSortField() {
        return Constant.WEBDRIVER.findElement(sltSortField);
    }

    private WebElement getBtnAddLevel() {
        return Constant.WEBDRIVER.findElement(btnAddLevel);
    }

    private WebElement getSltAndOr() {
        return Constant.WEBDRIVER.findElement(sltAndOr);
    }

    private WebElement getSltFilterField() {
        return Constant.WEBDRIVER.findElement(sltFilterField);
    }

    private WebElement getSltOperator() {
        return Constant.WEBDRIVER.findElement(sltOperator);
    }

    private WebElement getTxtValue() {
        return Constant.WEBDRIVER.findElement(txtValue);
    }

    private WebElement getBtnAdd() {
        return Constant.WEBDRIVER.findElement(btnAdd);
    }

    private WebElement getBtnRemove() {
        return Constant.WEBDRIVER.findElement(btnRemove);
    }

    private WebElement getChbName() {
        return Constant.WEBDRIVER.findElement(chbName);
    }

    //Methods
    public void inputProfileName(String profileName) {
        getTxtProfileName().sendKeys(profileName);
    }

    public void selectItemType(String itemType) {
        Select item = new Select(getSltItemType());
        item.selectByVisibleText(itemType);
    }

    public void selectRelatedData(String rData) {
        Select related = new Select(getSltRelatedData());
        related.selectByVisibleText(rData);
    }

    public void clickNext() {
        getBtnNext().click();
    }

    public void clickFinish() {
        getBtnFinish().click();
    }

    public void clickCancel() {
        getBtnCancel().click();
    }

    public void clickBack() {
        getBtnBack().click();
    }

    public void clickCheckAll() {
        getBtnCheckAll().click();
    }

    public void clickUncheckAll() {
        getBtnUncheckAll().click();
    }

    public void selectField(String item) {
        Select field = new Select(getSltSortField());
        field.selectByVisibleText(item);
    }

    public void clickAddLevel() {
        getBtnAddLevel().click();
    }

    public void selectAndOr(String item) {
        Select field = new Select(getSltAndOr());
        field.selectByVisibleText(item);
    }

    public void selectFilterField(String item) {
        Select field = new Select(getSltFilterField());
        field.selectByVisibleText(item);
    }

    public void selectOperator(String item) {
        Select field = new Select(getSltOperator());
        field.selectByVisibleText(item);
    }

    public void inputValue(String value) {
        getTxtValue().sendKeys(value);
    }

    public void clickAdd() {
        getBtnAdd().click();
    }

    public void clickRemove() {
        getBtnRemove().click();
    }

    public void checkName() {
        getChbName().click();
    }
}
