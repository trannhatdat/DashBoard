package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditPanelPopup {
    //Locator
    private final By txtFolder = By.xpath("//input[@name='txtFolder']");
    private final By btnOK = By.xpath("//div[@class='ui-dialog editpanelDlg ui-draggable']//input[@value='OK']");
    //Element
    private WebElement getTxtFolder(){return Constant.WEBDRIVER.findElement(txtFolder);}
    private WebElement getBtnOK(){return Constant.WEBDRIVER.findElement(btnOK);}
    //Method
    public void sendkeyTxtFolder(){
        getTxtFolder().sendKeys("/Car Rental/abc");
    }
    public void clickBtnOK(){
        getBtnOK().click();
    }

}
