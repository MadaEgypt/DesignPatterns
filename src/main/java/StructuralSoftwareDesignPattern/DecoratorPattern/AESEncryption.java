package StructuralSoftwareDesignPattern.DecoratorPattern;


public class AESEncryption extends EncryptionDecorator{

    public AESEncryption(DataSource dataSource) {

        super(dataSource);
    }

    @Override
    public String readData() {

        String AESEncryptData = super.readData() + " AES Encryption Method ()";
        return AESEncryptData ;
    }
}
