package state2.context;

import state2.concretestate.StateOff;
import state2.concretestate.StateOn;
import state2.state.State;

public class Light {
	private State state = new StateOff();

	public void setState(State state) {
		this.state = state;
	}

	public void onButtonPushed() {
		state.onButtonPushed(this);
	}

	public void offButtonPushed() {
		state.offButtonPushed(this);
	}

	public static void main(String[] args) {
		Light light = new Light();
		light.setState(new StateOn());
		light.onButtonPushed();
	}
}
