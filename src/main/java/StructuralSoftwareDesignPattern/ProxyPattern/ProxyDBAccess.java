package StructuralSoftwareDesignPattern.ProxyPattern;

public class ProxyDBAccess implements DBConnector{

    private String dbNam ;

    RealDBAccess realDBAccess;

    public ProxyDBAccess(String dbNam) {

        this.dbNam = dbNam;
    }

    @Override
    public void grantDBAccess() {

        if (dbNam.equals("Production")){
            realDBAccess = new RealDBAccess(dbNam);
            realDBAccess.grantDBAccess();

        }else {
            System.out.println("You Can Not Connect To DB : " + dbNam);
        }

    }
}
