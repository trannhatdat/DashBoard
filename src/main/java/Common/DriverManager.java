package Common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static void open(){
        Constant.WEBDRIVER.navigate().to(Constant.TA_DASHBOARD_URL);
    }

    public static void maximizedWindow(){
        Constant.WEBDRIVER.manage().window().maximize();
    }

    public static void acceptAlert(){
        Constant.WEBDRIVER.switchTo().alert().accept();
    }

    public static void getBrowserDriver(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath() + "\\Executables\\chromedriver.exe");
                Constant.WEBDRIVER = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", Utilities.getProjectPath() + "\\Executables\\geckodriver.exe");
                Constant.WEBDRIVER = new FirefoxDriver();
                break;
        }
    }

    public static void quitDriver() {
        Constant.WEBDRIVER.quit();
    }

    public static void pageLoadTimeout() {
        Constant.WEBDRIVER.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    public static void implicitlyWait() {
        Constant.WEBDRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
