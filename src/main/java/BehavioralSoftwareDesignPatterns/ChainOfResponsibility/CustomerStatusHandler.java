package BehavioralSoftwareDesignPatterns.ChainOfResponsibility;

public class CustomerStatusHandler extends CustomerHandler{
    @Override
    public boolean checkAvailability(int nationalID) {
        return true;
    }
    @Override
    protected void storeDataConfirmation() {

        System.out.println("No Housing Unit For This Customer");
    }
    @Override
    protected void storeDataNotConfirmation() {

        System.out.println("Housing Unit For This Customer Exist");
    }
}
