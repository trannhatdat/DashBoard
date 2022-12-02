package PageObjects;

import Common.Constant;
import DataObjects.AddPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddPagePopup extends GeneralPage{
    //Locators
    private final By txtPageName = By.xpath("//input[@id='name']");
    private final By sltParentPage = By.xpath("//select[@id='parent']");
    private final By sltNumberOfColumns = By.xpath("//select[@id='columnnumber']");
    private final By sltDisplayAfter = By.xpath("//select[@id='afterpage']");
    private final By chbPublic = By.xpath("//input[@id='ispublic']");
    private final By btnOK = By.xpath("//input[@type='button' and @value='OK']");
    private final By btnCancel = By.xpath("//input[@type='button' and @value='Cancel']");

    //Elements
    private WebElement getTxtPageName() {
        return Constant.WEBDRIVER.findElement(txtPageName);
    }

    private WebElement getSltParentPage() {
        return Constant.WEBDRIVER.findElement(sltParentPage);
    }

    private WebElement getSltNumberOfColumns() {
        return Constant.WEBDRIVER.findElement(sltNumberOfColumns);
    }

    private WebElement getSltDisplayAfter() {
        return Constant.WEBDRIVER.findElement(sltDisplayAfter);
    }

    private WebElement getChbPublic() {
        return Constant.WEBDRIVER.findElement(chbPublic);
    }

    private WebElement getBtnOK() {
        return Constant.WEBDRIVER.findElement(btnOK);
    }

    private WebElement getBtnCancel() {
        return Constant.WEBDRIVER.findElement(btnCancel);
    }

    //Methods
    public void inputPageName(String pageName) {
        this.getTxtPageName().sendKeys(pageName);
    }

    public void selectParentPage(String parentPage) {
        Select sltParentPage = new Select(this.getSltParentPage());
        sltParentPage.selectByVisibleText(parentPage);
    }

    public void selectColumnNumber(String columnNumber) {
        Select sltColumnNumber = new Select(this.getSltNumberOfColumns());
        sltColumnNumber.selectByVisibleText(columnNumber);
    }

    public void selectDisplayAfter(String display) {
        Select sltDisplayAfter = new Select(this.getSltDisplayAfter());
        sltDisplayAfter.selectByVisibleText(display);
    }

    public void checkPublic() {
        getChbPublic().click();
    }

    public void clickOK() {
        getBtnOK().click();
    }

    public void clickCancel() {
        getBtnCancel().click();
    }

    public void addNewPage(AddPage addPage) {
        inputPageName(addPage.getPageName());
        selectParentPage(addPage.getParentPage());
        selectColumnNumber(addPage.getColumnNumber());
        selectDisplayAfter(addPage.getDisplayAfter());
        checkPublic();
        clickOK();
    }
}
