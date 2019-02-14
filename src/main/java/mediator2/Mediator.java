package mediator2;

import java.util.ArrayList;

/**
 * ConcreateMediator
 */
public class Mediator implements Imediator {

	private ArrayList<Colleague> colleagues = new ArrayList<Colleague>();

	public Mediator(Colleague e) {
		e.setMediator(this);
		colleagues.add(e);
	}

	public void send(String colleague, String event) {
		for (Colleague s : colleagues) {
			if (s.getString() == colleague) {
				s.receive(colleague, event);
			}
		}
	}

}