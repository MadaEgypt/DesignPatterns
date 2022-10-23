package CreationalSoftwareDesignPatterns.SingletonPattern;

public class SingletonApp {
    public static void main(String[] args) {

        DBManager dbManager1 = DBManager.getInstance("127.0.0.1");
        System.out.println(dbManager1.getIp());

        DBManager dbManager2 = DBManager.getInstance("192.168.0.1");
        System.out.println(dbManager2.getIp());
    }
}
