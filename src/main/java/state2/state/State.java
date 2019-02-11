package state2.state;

import state2.context.Light;

public interface State {
	void onButtonPushed(Light light);
	void offButtonPushed(Light light);
}
