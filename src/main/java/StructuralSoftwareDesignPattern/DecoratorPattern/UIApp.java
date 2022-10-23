package StructuralSoftwareDesignPattern.DecoratorPattern;

public class UIApp {

    private static String drawChart (DataSource ds){

        return ds.readData();
    }

    public static void main(String[] args) {

        DataSource dsJSONIn = new DataProviderAdapter(new GetJASONData());
        DataProviderJSON JSONData = new GetJASONData();
        DataSource dsJSON = new DataProviderAdapter(JSONData );

        DataSource dsXML = new XMLSource();
        DataSource dsCSV = new CSVSource();

        System.out.println("===================JSON===========================");
        System.out.println(drawChart(dsJSONIn));
        System.out.println(drawChart(dsJSON));
        System.out.println("===================XML============================");
        System.out.println(drawChart(dsXML));
        System.out.println("===================CSV============================");
        System.out.println(drawChart(dsCSV));
        System.out.println("===================AESEncryption==================");

        AESEncryption aesEncryptionJSON = new AESEncryption(dsJSON);
        AESEncryption aesEncryptionXML = new AESEncryption(dsXML);
        AESEncryption aesEncryptionCSV = new AESEncryption(dsCSV);

        System.out.println(aesEncryptionJSON.readData());
        System.out.println(aesEncryptionXML.readData());
        System.out.println(aesEncryptionCSV.readData());
        System.out.println("===================RSEEncryption==================");

        RSEEncryption rseEncryptionJSON =new RSEEncryption(dsJSON);
        RSEEncryption rseEncryptionXML =new RSEEncryption(dsXML);
        RSEEncryption rseEncryptionCSV =new RSEEncryption(dsCSV);

        System.out.println(rseEncryptionJSON.readData());
        System.out.println(rseEncryptionXML.readData());
        System.out.println(aesEncryptionCSV.readData());
    }
}
