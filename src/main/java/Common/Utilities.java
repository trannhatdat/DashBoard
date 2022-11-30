package Common;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utilities {
    public static String getProjectPath() {
        String currentDirectory = System.getProperty("user.dir");
        return currentDirectory + "/src/main/java/";
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Constant.WEBDRIVER).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(Constant.WEBDRIVER);
        actions.moveToElement(element);
    }
    public static void getLog() {
        BasicConfigurator.configure();
    }
    public static String randomString(int len) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "!$#%^&*";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }
}
