package BehavioralSoftwareDesignPatterns.ChainOfResponsibility;

public class CustomerIncomeHandler extends CustomerHandler{
    @Override
    public boolean checkAvailability(int nationalID) {
        return true ;
    }
    @Override
    protected void storeDataConfirmation() {

        System.out.println("Income For This Customer Is Allowed");
    }

    @Override
    protected void storeDataNotConfirmation() {

        System.out.println("Income For This Customer Is Not Allowed");
    }
}
