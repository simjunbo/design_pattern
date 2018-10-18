package command.another;

/**
 * Invoker(기동자)
 */
public class SimpleRemoteControl {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonWasPressed() {
		command.execute();
	}
}
