package ua.bolzhelarskii.reports;

import java.time.LocalDate;

public class ReportA extends BaseReport{
    @Override
    protected String generateBody(){
        return "Generated report from "+ LocalDate.now();
    }
}
