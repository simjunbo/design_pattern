package command3;

/**
 * ConcreateCommand
 */
public class ButtonOn implements Command {
    private Receiver receiver;

    public ButtonOn(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.on();
    }
}
