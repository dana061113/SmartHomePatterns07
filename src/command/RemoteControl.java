package command;

public class RemoteControl {

    private ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){

        if(command == null){
            System.out.println("No command assigned");
            return;
        }

        command.execute();
    }
}
