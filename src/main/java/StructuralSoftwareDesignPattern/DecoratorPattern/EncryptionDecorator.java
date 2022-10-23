package StructuralSoftwareDesignPattern.DecoratorPattern;


public class EncryptionDecorator implements DataSource{

    DataSource dataSource ;

    public EncryptionDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
