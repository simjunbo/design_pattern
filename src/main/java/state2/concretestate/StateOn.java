package state2.concretestate;

import state2.context.Light;
import state2.state.State;

public class StateOn implements State {
	private static StateOn instance = new StateOn();

	public static State getInstance() {
		return instance;
	}

	public void onButtonPushed(Light light) {
		System.out.println("Do sleeping");
		light.setState(StateSleeping.getInstance());
	}

	public void offButtonPushed(Light light) {
		System.out.println("Turn off");
		light.setState(StateOff.getInstance());
	}
}
