package state;

import state.A3.LunchState;

/**
 * ConcreteState(구체적인 상태)의 역할
 */
public class DayState implements State {
	private static DayState singelton = new DayState();

	private DayState() {

	}

	public static State getInstance() {
		return singelton;
	}

	// 시간 설정
	public void doClock(Context context, int hour) {
		if (12 <= hour && hour < 13) {
			context.changeState(LunchState.getInstance());
		} else if (hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		}
	}

	// 금고 사용
	public void doUse(Context context) {
		context.recordLog("금고사용(주간)");
	}

	// 비상벨
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(주간)");
	}

	// 일반 통화
	public void doPhone(Context context) {
		context.callSecurityCenter("일반통화(주간)");
	}

	public String toString() {
		return "[주간]";
	}
}
