package Common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utilities {
    public static String getProjectPath() {
        String currentDirectory = System.getProperty("user.dir");
        return currentDirectory + "/src/main/java/";
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Constant.WEBDRIVER).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
