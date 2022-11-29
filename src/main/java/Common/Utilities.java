package Common;

public class Utilities {
    public static String getProjectPath() {
        String currentDirectory = System.getProperty("user.dir");
        return currentDirectory + "/src/main/java/";
    }
}
