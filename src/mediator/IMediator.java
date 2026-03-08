package mediator;

public interface IMediator {

    void sendMessage(String message, User sender);

    void addUser(User user);
}
