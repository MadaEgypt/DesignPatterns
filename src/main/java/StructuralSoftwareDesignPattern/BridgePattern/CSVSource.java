package StructuralSoftwareDesignPattern.BridgePattern;

public class CSVSource extends DataSource {

    public CSVSource() {}

    public CSVSource(BaseEncryption baseEncryption) {

        this.baseEncryption = baseEncryption;
    }

    @Override
    public String readPlanData() {

        return "101, Mohamed, Sayed";
    }

    @Override
    public String readEncryptedData() {
        return baseEncryption.encryptData("101, Mohamed, Sayed ");
    }
}
