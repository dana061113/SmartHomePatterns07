package mediator;

public class User {

    private IMediator mediator;
    private String name;

    public User(IMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message){

        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message){

        System.out.println(name + " receives: " + message);
    }
}
