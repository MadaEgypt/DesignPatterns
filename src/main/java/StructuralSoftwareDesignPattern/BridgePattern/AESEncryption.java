package StructuralSoftwareDesignPattern.BridgePattern;


public class AESEncryption implements BaseEncryption {

    @Override
    public String encryptData(String data) {

        return data + " + AES Encryption Method ()";
    }
}
