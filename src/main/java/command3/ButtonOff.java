package command3;

/**
 * ConcreateCommand
 */
public class ButtonOff implements Command {
    private Receiver receiver;

    public ButtonOff(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.off();
    }
}
