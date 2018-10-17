package state.A3;

import state.Context;
import state.DayState;
import state.NightState;
import state.State;

public class LunchState implements State {
	private static LunchState singelton = new LunchState();

	private LunchState() {

	}

	public static State getInstance() {
		return singelton;
	}

	public void doClock(Context context, int hour) {
		if (hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		} else if (9 < hour && hour < 12 || 13 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}

	// 금고 사용
	public void doUse(Context context) {
		context.callSecurityCenter("비상 : 점심금고 사용!");
	}

	// 비상벨
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(점심)");
	}

	// 일반 통화
	public void doPhone(Context context) {
		context.autoMessage();
	}

	public String toString() {
		return "[점심]";
	}
}
