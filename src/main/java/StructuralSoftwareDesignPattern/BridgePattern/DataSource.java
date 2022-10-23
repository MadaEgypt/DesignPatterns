package StructuralSoftwareDesignPattern.BridgePattern;

public abstract class DataSource {

    BaseEncryption baseEncryption ;

    public abstract String readPlanData();

    public abstract String readEncryptedData() ;
}
