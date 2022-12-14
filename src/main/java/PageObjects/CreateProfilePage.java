package PageObjects;

import Common.Constant;
import DataObjects.FilterCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateProfilePage extends GeneralPage {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(CreateProfilePage.class);
    private final String xpathCheckBox = "//input[@type='checkbox' and @value='%s']";
    //Locators
    private final By txtProfileName = By.xpath("//input[@id='txtProfileName']");
    private final By sltItemType = By.xpath("//select[@id='cbbEntityType']");
    private final By listItemType = By.xpath("//select[@id='cbbEntityType']/option");
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
    private final By optCondition = By.xpath("//select[@id='listCondition']/option");
    private final By btnAdd = By.xpath("//button[@title='Add condition']");
    private final By btnRemove = By.xpath("//button[@title='Remove condition']");

    //Elements
    private WebElement getTxtProfileName() {
        return Constant.WEBDRIVER.findElement(txtProfileName);
    }

    private WebElement getSltItemType() {
        return Constant.WEBDRIVER.findElement(sltItemType);
    }

    private List<WebElement> getListItemType() {
        return Constant.WEBDRIVER.findElements(listItemType);
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

    private WebElement getCheckBox(String value) {
        return Constant.WEBDRIVER.findElement(By.xpath(String.format(xpathCheckBox, value)));
    }

    private WebElement getOptCondition() {
        return Constant.WEBDRIVER.findElement(optCondition);
    }

    //Methods
    public void inputProfileName(String profileName) {
        getTxtProfileName().sendKeys(profileName);
    }

    public void selectItemType(String itemType) {
        Select item = new Select(getSltItemType());
        item.selectByVisibleText(itemType);
    }

    public String selectAndShowEachItemType() {
        String item = null;
        getListItemType().stream().forEach(e -> {
            selectItemType(e.getText().toLowerCase());
            item.concat(" | " +e.getText());
        });
        return item;
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

    public void selectSortField(String item) {
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

    public void AddFilterCriteria(FilterCriteria f) {
        selectAndOr(f.getAndOr());
        selectFilterField(f.getField());
        selectOperator(f.getOperator());
        inputValue(f.getValue());
        clickAdd();
    }

    public void clickRemove() {
        getBtnRemove().click();
    }

    public void checkCheckBox(String value) {
        getCheckBox(value).click();
    }

    public String getFilterCriteria() {
        return getOptCondition().getText();
    }
}
