package StructuralSoftwareDesignPattern.AdapterDesignPattern;

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

        System.out.println(drawChart(dsJSONIn));
        System.out.println(drawChart(dsJSON));
        System.out.println(drawChart(dsXML));
        System.out.println(drawChart(dsCSV));


    }
}
