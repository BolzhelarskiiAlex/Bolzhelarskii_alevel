package ua.bolzhelarskii.reports;

public class ReportB extends BaseReport{
    @Override
    protected String generateBody(){
        return "> Task :compileJava\n" +
                "> Task processResources NO-SOURCE\n"+
                "> Task :classes";
    }
}
