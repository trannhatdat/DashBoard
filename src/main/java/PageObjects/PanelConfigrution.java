package PageObjects;

import Common.Constant;
import Testcases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PanelConfigrution extends BaseTest {
    //Locator
    private final By btnOK = By.xpath("//div[@class='div_button']/input[@id='OK']");

    //Element
    private WebElement getBtnOK() {
        return Constant.WEBDRIVER.findElement(btnOK);
    }
    //Methods
    public void clickBtnOK(){
        getBtnOK().click();
    }

}

