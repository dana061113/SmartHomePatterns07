package command;

public class TVOnCommand implements ICommand {

    private TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute(){
        tv.on();
    }
}
