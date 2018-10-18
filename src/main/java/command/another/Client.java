package command.another;

/**
 * Client
 */
public class Client {
	public static void main(String[] args) {
		// invoker
		SimpleRemoteControl remote = new SimpleRemoteControl();

		// command
		LightOnCommand on = new LightOnCommand(new Light());
		LightOffCommand off = new LightOffCommand(new Light());

		remote.setCommand(on);
		remote.buttonWasPressed();

		remote.setCommand(off);
		remote.buttonWasPressed();
	}
}
