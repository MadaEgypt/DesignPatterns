package StructuralSoftwareDesignPattern.BridgePattern;

public class UIApp {

    public static void main(String[] args) {

        //"===================RSEEncryption=================="
        BaseEncryption RSEEEncryption = new RSEEncryption();
        //"===================AESEncryption=================="
        BaseEncryption AESEncryption = new AESEncryption();

        System.out.println("===================XML============================");
        DataSource XML = new XMLSource();
        DataSource XML_AES_Encryption = new XMLSource(AESEncryption);
        DataSource XML_RSEE_Encryption = new XMLSource(RSEEEncryption);

        System.out.println(XML.readPlanData());
        System.out.println(XML_AES_Encryption.readEncryptedData());
        System.out.println(XML_RSEE_Encryption.readEncryptedData());

        System.out.println("===================CSV============================");
        DataSource CSV = new CSVSource();
        DataSource CSV_AES_Encryption = new CSVSource(AESEncryption);
        DataSource CSV_RSEE_Encryption = new CSVSource(RSEEEncryption);

        System.out.println(CSV.readPlanData());
        System.out.println(CSV_AES_Encryption.readEncryptedData());
        System.out.println(CSV_RSEE_Encryption.readEncryptedData());

        System.out.println("==============================JSON==============================");
        DataProviderJSON JSONData = new GetJASONData();

        DataSource JSON = new DataProviderAdapter(JSONData );
        DataSource JSON_AES_Encryption = new DataProviderAdapter(JSONData, AESEncryption);
        DataSource JSON_RSEE_Encryption = new DataProviderAdapter(JSONData, RSEEEncryption);

        System.out.println(JSON.readPlanData());
        System.out.println(JSON_AES_Encryption.readEncryptedData());
        System.out.println(JSON_RSEE_Encryption.readEncryptedData());
        System.out.println("==============================JSONIn==============================");
        DataSource JSONIn = new DataProviderAdapter(new GetJASONData());
        DataSource JSONIn_AES_Encryption = new DataProviderAdapter(new GetJASONData(),AESEncryption);
        DataSource JSONIn_RSEE_Encryption = new DataProviderAdapter(new GetJASONData(),RSEEEncryption);

        System.out.println(JSONIn.readPlanData());
        System.out.println(JSONIn_AES_Encryption.readEncryptedData());
        System.out.println(JSONIn_RSEE_Encryption.readEncryptedData());
    }
}