package StructuralSoftwareDesignPattern.BridgePattern;

public class DataProviderAdapter extends DataSource {
    DataProviderJSON dataProviderJSON;

    public DataProviderAdapter(DataProviderJSON dataProviderJSON) {

        this.dataProviderJSON = dataProviderJSON;
    }

    public DataProviderAdapter(DataProviderJSON dataProviderJSON , BaseEncryption baseEncryption ) {

        this.dataProviderJSON = dataProviderJSON;

        this.baseEncryption = baseEncryption;
    }

    @Override
    public String readPlanData() {

        return dataProviderJSON.getJSONData();
    }

    @Override
    public String readEncryptedData() {

        return baseEncryption.encryptData(dataProviderJSON.getJSONData());
    }
}
