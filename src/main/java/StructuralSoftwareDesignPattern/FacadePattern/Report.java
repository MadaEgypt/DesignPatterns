package StructuralSoftwareDesignPattern.FacadePattern;

public abstract class Report {
    ReportStructure reportHeader ;
    ReportStructure reportBody ;
    ReportStructure reportFooter ;

    public Report() {
        this.reportHeader = new ReportHeader();
        this.reportBody = new ReportBody();
        this.reportFooter = new ReportFooter();
    }

    public abstract void createReport ();
}
