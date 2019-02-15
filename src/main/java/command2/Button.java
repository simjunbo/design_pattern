package command2;

/**
 * Invoker
 */
public class Button {
	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public void execute() {
		command.execute();
	}
}
