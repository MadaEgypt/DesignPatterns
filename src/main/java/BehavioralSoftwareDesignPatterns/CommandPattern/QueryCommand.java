package BehavioralSoftwareDesignPatterns.CommandPattern;

public class QueryCommand implements Command{

    AccountOperation accountOperation = new AccountOperation();
    @Override
    public void execute() {

        accountOperation.accountQuery();
    }

    @Override
    public void uno() {

    }
}
