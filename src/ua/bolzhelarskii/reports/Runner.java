package ua.bolzhelarskii.reports;

public class Runner {
    public static void main(String[] args) {
        BaseReport baseReport = new BaseReport();
        System.out.println(baseReport.generateReport());
        BaseReport reportA = new ReportA();
        System.out.println(reportA.generateReport());
        BaseReport reportB = new ReportB();
        System.out.println(reportB.generateReport());

    }
}
