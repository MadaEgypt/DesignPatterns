package BehavioralSoftwareDesignPatterns.CommandPattern;

public class AccountOperation {

    public void accountQuery (){

        System.out.println("Show Account Data");
    }

    public void accountDataToEmail (){

        System.out.println("Data Send To Email");
    }

    public void byeDeposit (){

        System.out.println("Bye Done......!");
    }

    public void transfer (){

        System.out.println("Transfer Done......!");
    }
}
