package state;

import state.A3.LunchState;

/**
 * ConcreteState(구체적인 상태)의 역할
 */
public class NightState implements State {
	private static NightState singelton = new NightState();

	private NightState() {

	}

	public static State getInstance() {
		return singelton;
	}

	// 시간 설정
	public void doClock(Context context, int hour) {
		if (12 <= hour && hour < 13) {
			context.changeState(LunchState.getInstance());
		} else if (9 < hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}

	// 금고 사용
	public void doUse(Context context) {
		context.callSecurityCenter("비상 : 야간금고 사용!");
	}

	// 비상벨
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(야간)");
	}

	// 일반 통화
	public void doPhone(Context context) {
		context.recordLog("야간통화 녹음");
	}

	public String toString() {
		return "[야간]";
	}
}
