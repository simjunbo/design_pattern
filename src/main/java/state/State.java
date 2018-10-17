package state;

/**
 * State(상태)의 역할
 */
public interface State {
	void doClock(Context context, int hour); // 시간설정

	void doUse(Context context);    // 금고사용

	void doAlarm(Context context);  // 비상벨

	void doPhone(Context context);  // 일반통화
}
