package state2.concretestate;

import state2.context.Light;
import state2.state.State;

public class StateSleeping implements State {
	private static StateSleeping instance = new StateSleeping();

	public static State getInstance() {
		return instance;
	}

	public void onButtonPushed(Light light) {
		System.out.println("more brightly!");
		light.setState(StateOn.getInstance());
	}

	public void offButtonPushed(Light light) {
		System.out.println("Turn off this light.");
		light.setState(StateOff.getInstance());
	}
}

