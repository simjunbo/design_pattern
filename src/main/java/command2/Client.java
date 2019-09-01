package command2;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp(); // receiver
		LampOnCommand lampOnCommand = new LampOnCommand(lamp); // concreteCommand (receiver di)

		Alarm alarm = new Alarm();
		AlarmStartCommand alarmStartCommand = new AlarmStartCommand(alarm);

		Button button1 = new Button(lampOnCommand); // invoker
		Button button2 = new Button(alarmStartCommand);

		button1.execute();
		button2.execute();
	}
}
