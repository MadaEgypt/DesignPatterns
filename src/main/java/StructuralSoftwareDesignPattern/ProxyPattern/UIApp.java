package StructuralSoftwareDesignPattern.ProxyPattern;

public class UIApp {
    public static void main(String[] args) {

        ProxyDBAccess proxyDBAccessTest = new ProxyDBAccess("Test");
        proxyDBAccessTest.grantDBAccess();

        ProxyDBAccess proxyDBAccessProduction = new ProxyDBAccess("Production");
        proxyDBAccessProduction.grantDBAccess();
    }

}
