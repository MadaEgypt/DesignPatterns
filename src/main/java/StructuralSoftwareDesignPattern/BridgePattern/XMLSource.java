package StructuralSoftwareDesignPattern.BridgePattern;

public class XMLSource extends DataSource {

    public XMLSource() {}

    public XMLSource(BaseEncryption baseEncryption) {

        this.baseEncryption = baseEncryption;
    }

    @Override
    public String readPlanData() {

        return "<id> 101 </id> <name> Mohamed Sayed </name>";
    }

    @Override
    public String readEncryptedData() {
        return baseEncryption.encryptData("<id> 101 </id> <name> Mohamed Sayed </name> ");
    }
}
