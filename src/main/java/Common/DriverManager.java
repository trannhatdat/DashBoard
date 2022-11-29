package Common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {
    public static void open(){
        Constant.WEBDRIVER.navigate().to(Constant.TA_DASHBOARD_URL);
    }

    public static void maxScreen(){
        Constant.WEBDRIVER.manage().window().maximize();
    }

    public static void acceptAlert(){
        try{
            WebDriverWait wait = new WebDriverWait(Constant.WEBDRIVER, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = Constant.WEBDRIVER.switchTo().alert();
            alert.accept();
        }
        catch(Exception e){
            System.out.println("No such alert error!");
        }
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
}
