package command2;

/**
 * ConcreteCommand
 */
public class LampOnCommand implements Command {
	private Lamp lamp;

	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}

	public void execute() {
		lamp.turnOn();
	}
}

/**
 * Receiver
 */
class Lamp {
	public void turnOn() {
		System.out.println("Lamp On");
	}
}