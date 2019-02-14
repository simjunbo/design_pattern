package mediator2;

/**
 * ConcreteColleague
 */
public class Com_1 extends Colleague {

	private String name = "COM 1";
	private String to = "COM_2";

	@Override
	public void send(String event) {
		mediator.send(to, event);
	}

	@Override
	public void receive(String name, String event) {
		System.out.println("Receive from " + name);

	}

	@Override
	public String getString() {
		return name;
	}
}