package BehavioralSoftwareDesignPatterns.CommandPattern;

public class UIApp {

    public static void main(String[] args) {

        AccountOperation accountOperation = new AccountOperation ();

        accountOperation.accountQuery();

        accountOperation.accountDataToEmail();

        accountOperation.byeDeposit();

        accountOperation.transfer();

    }
}
