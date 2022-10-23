package StructuralSoftwareDesignPattern.DecoratorPattern;


public class RSEEncryption extends EncryptionDecorator{

    public RSEEncryption(DataSource dataSource) {

        super(dataSource);
    }

    @Override
    public String readData() {

        String RSEEncryptData = super.readData() + " RSE Encryption Method ()";
        return RSEEncryptData ;
    }
}
