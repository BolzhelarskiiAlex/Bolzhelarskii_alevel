package ua.bolzhelarskii.reports;

public abstract class BaseReport implements ReportInterface{
    private final String generateFooter(){
        return System.lineSeparator() + "================" + System.lineSeparator() + "Footer example";
    }
    private final String generateHeader(){
        return "Header example: Report" + System.lineSeparator() + "================" + System.lineSeparator();
    }
    protected  abstract String generateBody();
    @Override
    public String generateReport(){
        return generateHeader() + generateBody() + generateFooter();
    }
}
