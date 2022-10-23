package StructuralSoftwareDesignPattern.AdapterDesignPattern;

public class XMLSource implements DataSource{

    @Override
    public String readData() {
        return "<id>101</id> <name>Mohamed Sayed </name>";
    }
}
