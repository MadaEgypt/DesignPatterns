package StructuralSoftwareDesignPattern.FacadePattern;

public class ReportSystemGetWay2 {
    private final Report report;

    public ReportSystemGetWay2(Report report) {
        this.report = report;
    }

    public void generateReport (){
        this.report.createReport();
    }

}
