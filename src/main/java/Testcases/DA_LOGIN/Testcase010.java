package Testcases.DA_LOGIN;

import DataObjects.User;
import PageObjects.LoginPage;
import Testcases.BaseTest;
import org.testng.annotations.Test;

import java.util.logging.LogManager;

public class Testcase010 extends BaseTest {
    @Test
    public void DA_LOGIN_TC010(){
        LoginPage loginPage = new LoginPage();
        User user = new User("","");
        loginPage.login(user);
    }
}
