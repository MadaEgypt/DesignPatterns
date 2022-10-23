package StructuralSoftwareDesignPattern.BridgePattern;


public class RSEEncryption implements BaseEncryption {

    @Override
    public String encryptData(String data) {

        return  data + " + RSE Encryption Method ()";
    }
}
