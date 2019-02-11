package state2.context;

import state2.concretestate.StateOff;
import state2.state.State;

/**
 * 참고) https://sticky32.tistory.com/entry/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%8A%B8-%ED%8C%A8%ED%84%B4State-Pattern
 */
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
		light.onButtonPushed();
		light.offButtonPushed();
	}
}
