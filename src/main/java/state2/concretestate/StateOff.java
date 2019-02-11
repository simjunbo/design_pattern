package state2.concretestate;

import state2.context.Light;
import state2.state.State;

public class StateOff implements State {
	private static StateOff instance = new StateOff();

	public static State getInstance() {
		return instance;
	}

	public void onButtonPushed(Light light) {
		System.out.println("Turn on.");
		light.setState(StateOn.getInstance());
	}

	public void offButtonPushed(Light light) {
		System.out.println("Do nothing.");
	}
}