package PageObjects;

import Common.Constant;
import DataObjects.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends GeneralPage{
    //Locators
    private final By sltRepository = By.id("repository");
    private final By txtUsername = By.id("username");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.xpath("//div[@class='btn-login']");

    //Elements
    private WebElement getSltRepository() {
        return Constant.WEBDRIVER.findElement(sltRepository);
    }

    private WebElement getTxtUsername() {
        return Constant.WEBDRIVER.findElement(txtUsername);
    }

    private WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    private WebElement getBtnLogin() {
        return Constant.WEBDRIVER.findElement(btnLogin);
    }

    //Methods
    public void selectRepository(String repos) {
        Select repository = new Select(this.getSltRepository());
        repository.selectByVisibleText(repos);
    }

    public void inputUsername(String username) {
        this.getTxtUsername().sendKeys(username);
    }

    public void inputPassword(String password) {
        this.getTxtPassword().sendKeys(password);
    }

    public void login(User user) {
        inputUsername(user.getUsername());
        inputPassword(user.getPassword());
        this.getBtnLogin().click();
    }
}
