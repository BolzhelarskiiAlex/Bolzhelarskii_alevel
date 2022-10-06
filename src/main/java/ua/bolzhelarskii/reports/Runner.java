package ua.bolzhelarskii.reports;

public class Runner {
    public static void main(String[] args) {
        ReportInterface reportA = new ReportA();
        System.out.println(reportA.generateReport());
        ReportInterface reportB = new ReportB();
        System.out.println(reportB.generateReport());

    }
}