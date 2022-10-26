package BehavioralSoftwareDesignPatterns.CommandPattern;

public class BuyDepositCommand implements Command{

    AccountOperation accountOperation = new AccountOperation();
    @Override
    public void execute() {

        accountOperation.byeDeposit();

    }

    @Override
    public void uno() {

    }
}
