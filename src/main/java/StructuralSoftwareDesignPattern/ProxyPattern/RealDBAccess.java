package StructuralSoftwareDesignPattern.ProxyPattern;

public class RealDBAccess implements DBConnector{

    private String dbname ;

    public RealDBAccess(String dbname) {
        this.dbname = dbname;
    }

    @Override
    public void grantDBAccess() {

        System.out.println("Connect Done To DB : " + dbname);

    }
}
