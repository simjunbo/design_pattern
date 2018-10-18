package command.another;

/**
 * ConcreateCommand
 */
public class LightOnCommand implements Command {
	// receiver
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
