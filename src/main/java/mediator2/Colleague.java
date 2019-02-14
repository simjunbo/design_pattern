package mediator2;

/**
 * Colleague
 */
public abstract class Colleague {
	Imediator mediator;

	public void setMediator(Imediator mediator) {
		this.mediator = mediator;
	}

	abstract public void send(String event);

	abstract public void receive(String name, String event);

	abstract public String getString();
}