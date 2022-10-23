package StructuralSoftwareDesignPattern.FacadePattern;

public class ReportExcel extends Report{
    @Override
    public void createReport() {
        System.out.println(reportHeader.text());
        System.out.println(reportBody.text());
        System.out.println(reportFooter.text());
        System.out.println("Excel Report Created");
    }
}
