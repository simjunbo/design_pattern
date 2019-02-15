package command2;

/**
 * ConcreteCommand
 */
public class AlarmStartCommand implements Command {
	private Alarm alarm;

	public AlarmStartCommand(Alarm alarm) {
		this.alarm = alarm;
	}

	public void execute() {
		alarm.start();
	}
}

/**
 * Receiver
 */
class Alarm {
	public void start() {
		System.out.println("Alarming");
	}
}
