package mediator3;

/**
 * ConcreateColleague
 */
public class User extends Colleague {

    User(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void sendMessages(String str) {
        System.out.println("send : " + str);
        mediator.sendMessage(str, this);
    }

    public void receiveMessages(String str) {
        System.out.println(name + " recv : " + str);
    }
}
