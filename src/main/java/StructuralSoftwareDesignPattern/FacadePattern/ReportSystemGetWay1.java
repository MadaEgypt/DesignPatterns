package StructuralSoftwareDesignPattern.FacadePattern;

public class ReportSystemGetWay1 {
    private Report reportExel;
    private Report reportPDF;

    public ReportSystemGetWay1() {
        this.reportExel = new ReportExcel();
        this.reportPDF = new ReportPDF();
    }

    public void generateExelReport (){
        reportExel.createReport();
    }

    public void generatePDFReport (){
        reportPDF.createReport();
    }



}
