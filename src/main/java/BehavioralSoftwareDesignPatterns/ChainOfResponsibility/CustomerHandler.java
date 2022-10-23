package BehavioralSoftwareDesignPatterns.ChainOfResponsibility;

public abstract class CustomerHandler {

    private CustomerHandler nextCustomerHandler ;

    public void setNextCustomerChecker(CustomerHandler nextCustomerHandler) {

        this.nextCustomerHandler = nextCustomerHandler ;
    }

    public void storeHousingUnitData ( int nationalID){

        if ( checkAvailability (nationalID) ) {
            storeDataConfirmation();
            if ( nextCustomerHandler != null){
                nextCustomerHandler.storeHousingUnitData(nationalID);
            } }
        else {
            storeDataNotConfirmation();
        } }

    public abstract boolean checkAvailability (int nationalID);
    protected abstract void storeDataConfirmation();
    protected abstract void storeDataNotConfirmation();





}
