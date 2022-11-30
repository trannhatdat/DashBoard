package DataObjects;

public class AddPage {
    private String pageName;
    private String parentPage;
    private String columnNumber;

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getParentPage() {
        return parentPage;
    }

    public void setParentPage(String parentPage) {
        this.parentPage = parentPage;
    }

    public String getColumnNumber() {
        return columnNumber;
    }

    public void setColumnnumber(String columnNumber) {
        this.columnNumber = columnNumber;
    }

    public String getDisplayAfter() {
        return displayAfter;
    }

    public void setDisplayAfter(String displayAfter) {
        this.displayAfter = displayAfter;
    }

    private String displayAfter;

    public AddPage(String pageName, String parentPage, String columnNumber, String displayAfter) {
        this.pageName = pageName;
        this.parentPage = parentPage;
        this.columnNumber = columnNumber;
        this.displayAfter = displayAfter;
    }
}
