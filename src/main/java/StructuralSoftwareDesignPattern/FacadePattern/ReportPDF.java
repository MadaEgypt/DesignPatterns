package StructuralSoftwareDesignPattern.FacadePattern;

public class ReportPDF extends Report{

    @Override
    public void createReport() {
        System.out.println(reportHeader.text());
        System.out.println(reportBody.text());
        System.out.println(reportFooter.text());
        System.out.println("PDF Report Created");
    }
}
