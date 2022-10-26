package BehavioralSoftwareDesignPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class OperationInvoker {

    private Command command ;

    private static List < Command> queueCommand = new ArrayList<>();

    public OperationInvoker(Command command) {


        this.command = command;

        queueCommand.add(command);
    }

    public void execute(){
        // - code data
        // - balance
        this.command.execute();
        // - balance
    }

    public static void setQueueCommand(List<Command> queueCommand) {

        OperationInvoker.queueCommand = queueCommand;
    }

    public static void addToQueueCommand(Command command) {

        OperationInvoker.queueCommand.add(command);
    }

    public static void executeCommands (){

        for (Command command : queueCommand) {

            command.execute();
        }
    }
}
