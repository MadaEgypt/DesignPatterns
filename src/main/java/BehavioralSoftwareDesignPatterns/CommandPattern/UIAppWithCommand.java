package BehavioralSoftwareDesignPatterns.CommandPattern;

public class UIAppWithCommand {

    public static void main(String[] args) {

        System.out.println("\n* =========================================================================== *" );

        Command buyDepositCommand = new BuyDepositCommand();

        OperationInvoker buyOperationInvoker = new OperationInvoker(buyDepositCommand);

        buyOperationInvoker.execute();

        System.out.println("* =========================================================================== *" );

        Command transferCommand = new TransferCommand();

        OperationInvoker TransferOperationInvoker = new OperationInvoker(transferCommand);

        TransferOperationInvoker.execute();

        System.out.println("* =========================================================================== *" );

        Command QueryCommand = new QueryCommand();

        OperationInvoker queryOperationInvoker = new OperationInvoker(QueryCommand);

        queryOperationInvoker.execute();

        System.out.println("* =========================================================================== *" );

        Command dataToEmailCommand = new DataToEmailCommand();

        OperationInvoker emailOperationInvoker = new OperationInvoker(dataToEmailCommand);

        emailOperationInvoker.execute();

        System.out.println("* =========================================================================== *" );

        OperationInvoker.executeCommands();

    }
}
