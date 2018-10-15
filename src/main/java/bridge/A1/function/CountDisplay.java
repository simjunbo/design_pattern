package bridge.A1.function;

import bridge.A1.implement.DisplayImpl;

/**
 * RefinedAbstraction(개선된 추상화)의 역할
 */
public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
