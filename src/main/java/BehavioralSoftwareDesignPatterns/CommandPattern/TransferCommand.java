package BehavioralSoftwareDesignPatterns.CommandPattern;

public class TransferCommand implements Command{

    AccountOperation accountOperation = new AccountOperation();

    @Override
    public void execute() {

        accountOperation.transfer();

    }

    @Override
    public void uno() {

    }
}
