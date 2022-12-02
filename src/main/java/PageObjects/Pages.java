package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pages{
    //Locator
    private final By btnEdit = By.xpath("//div[@class='al_rgh']//ul/li[@class='edit']");
    //Element
    private WebElement getBtnEdit(){return Constant.WEBDRIVER.findElement(btnEdit);}
    //Method
    public void clickBtnEdit(){
        getBtnEdit().click();
    }
}
