package state;

/**
 * Context(상황, 전후관계, 문맥)의 역할
 */
public interface Context {
	void setClock(int hour);

	void changeState(State state);

	void callSecurityCenter(String msg);

	void recordLog(String msg);

	void autoMessage();
}
