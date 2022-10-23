package StructuralSoftwareDesignPattern.DecoratorPattern;

public class GetJASONData implements DataProviderJSON {

    @Override
    public String getJSONData() {
        return "{ id : 101, name : mohamed sayed }";
    }
}
