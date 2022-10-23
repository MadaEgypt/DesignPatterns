package BehavioralSoftwareDesignPatterns.ChainOfResponsibility;

public class UIApp {


    public static void main(String[] args) {

        CustomerHandler customerHandler = DoChaining.doChaining() ;
        customerHandler.storeHousingUnitData(123456789);
    }

}
