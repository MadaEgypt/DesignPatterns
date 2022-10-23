package BehavioralSoftwareDesignPatterns.ChainOfResponsibility;

public class CustomerDataHandler extends CustomerHandler{

    @Override
    public boolean checkAvailability(int nationalID) {
        return true;
    }
    @Override
    protected void storeDataConfirmation() {

        System.out.println("This Customer Has Children");
    }
    @Override
    protected void storeDataNotConfirmation() {

        System.out.println("This Customer Not Have Children");
    }
}
