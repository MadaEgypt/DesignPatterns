package StructuralSoftwareDesignPattern.FacadePattern;

public class ReportHeader implements ReportStructure{

    @Override
    public String text() {
        return "TextHeader ...........";
    }
}
