package StructuralSoftwareDesignPattern.BridgePattern;

public class GetJASONData implements DataProviderJSON {

    @Override
    public String getJSONData() {

        return "{ id : 101, name : mohamed sayed } ";
    }
}
