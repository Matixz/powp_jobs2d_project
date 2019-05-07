package command;

import java.util.ArrayList;

private class ComplexCommand implements DriverCommand{
    ArrayList<DriverCommand> commandQueue;

    public ComplexCommand(ArrayList<DriverCommand> commandQueue) {
        this.commandQueue = commandQueue;
    }

    public ComplexCommand() {
        commandQueue=new ArrayList<>();
    }

    public void execute()
    {
        for (DriverCommand command : commandQueue){
            if (command DriverCommand){
                command.execute();
            }
        }
    }
    public void addCommend(DriverCommand driverCommand)
    {
        commandQueue.add(driverCommand);
    }
}