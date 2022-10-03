package ua.bolzhelarskii.reports;

public class BaseReport {
    protected String generateFooter(){
        return System.lineSeparator() + "================" + System.lineSeparator() + "Footer example";
    }
    protected String generateHeader(){
        return "Header example: Report" + System.lineSeparator() + "================" + System.lineSeparator();
    }
    protected  String generateBody(){
        return "empty body";
    }
    public String generateReport(){
        return generateHeader() + generateBody() + generateFooter();
    }
}
