package StructuralSoftwareDesignPattern.AdapterDesignPattern;

public class DataProviderAdapter implements DataSource{

    DataProviderJSON dataProviderJSON;

    public DataProviderAdapter(DataProviderJSON dataProviderJSON) {
        this.dataProviderJSON = dataProviderJSON;
    }

    @Override
    public String readData() {
        return dataProviderJSON.getJSONData();
    }
}
