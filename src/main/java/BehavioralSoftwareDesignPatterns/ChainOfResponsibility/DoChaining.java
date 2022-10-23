package BehavioralSoftwareDesignPatterns.ChainOfResponsibility;

public class DoChaining {

    public static CustomerHandler doChaining(){

        CustomerHandler customerIncomeHandler = new CustomerIncomeHandler ();
        CustomerHandler customerStatusHandler = new CustomerStatusHandler ();
        CustomerHandler customerDataHandler = new CustomerDataHandler ();

        customerIncomeHandler.setNextCustomerChecker(customerStatusHandler);
        customerStatusHandler.setNextCustomerChecker(customerDataHandler);

        return customerIncomeHandler ;

    }
}
