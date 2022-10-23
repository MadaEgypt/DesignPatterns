package StructuralSoftwareDesignPattern.DecoratorPattern;

public class CSVSource implements DataSource {

    @Override
    public String readData() {
        return "101, Mohamed Sayed";
    }
}
