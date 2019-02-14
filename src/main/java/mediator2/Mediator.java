package mediator2;

import java.util.ArrayList;

/**
 * ConcreateMediator
 */
public class Mediator implements Imediator {

	private ArrayList<Colleague> TestArray = new ArrayList<Colleague>();

	public Mediator(Colleague e) {
		e.setMediator(this);
		TestArray.add(e);
	}

	public void send(String colleague, String event) {
		for (Colleague s : TestArray) {
			if (s.getString() == colleague) {
				s.receive(colleague, event);
			}
		}
	}

}