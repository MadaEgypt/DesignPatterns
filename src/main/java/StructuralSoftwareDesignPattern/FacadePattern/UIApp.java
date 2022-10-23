package StructuralSoftwareDesignPattern.FacadePattern;

public class UIApp {

    public static void main(String[] args) {

        System.out.println("\n* =============== Report System GetWay 1 =============== *");
        ReportSystemGetWay1 reportSystemGetWay1 = new ReportSystemGetWay1();
        System.out.println("\n=============== Exel Report ===============");
        reportSystemGetWay1.generateExelReport();
        System.out.println("\n=============== PDF Report ===============");
        reportSystemGetWay1.generatePDFReport();


        //* === I Prefer It === *
        System.out.println("\n* =============== Report System GetWay 2 =============== *");
        System.out.println("\n=============== Exel Report ===============");
        ReportSystemGetWay2 reportSystemGetWayExel = new ReportSystemGetWay2(new ReportExcel());
        reportSystemGetWayExel.generateReport();
        System.out.println("\n=============== PDF Report ===============");
        ReportSystemGetWay2 reportSystemGetWayPDF = new ReportSystemGetWay2(new ReportPDF());
        reportSystemGetWayPDF.generateReport();

    }
}
