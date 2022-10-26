package BehavioralSoftwareDesignPatterns.CommandPattern;

public class DataToEmailCommand implements Command{

    AccountOperation accountOperation = new AccountOperation();
    @Override
    public void execute() {

        accountOperation.accountDataToEmail();

    }

    @Override
    public void uno() {

    }
}
