package command3;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ButtonOff(receiver);

        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
