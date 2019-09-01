package mediator3;

/**
 * Mediator
 */
public interface Mediator {
    void appendUser(Colleague colleague);

    void removeUser(Colleague colleague);

    void sendMessage(String message, Colleague sender);

    void notice(String message);
}
