package CreationalSoftwareDesignPatterns.SingletonPattern;

public class DBManager {

    private static  DBManager instance ;

    private String ip ;


    private DBManager(String ip) {
        this.ip = ip;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    public static DBManager getInstance(String ip) {
        if ( instance == null) {
            instance = new DBManager((ip));
            return instance ;
        } else {
            return instance;
        }
    }
}
