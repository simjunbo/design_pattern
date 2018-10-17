package observer.A1;

import observer.NumberGenerator;

public class IncrementalNumberGenerator extends NumberGenerator {

	private int min, max, plus;

	private int now;

	public IncrementalNumberGenerator(int min, int max, int plus) {
		this.min = min;
		this.max = max;
		this.plus = plus;
	}

	public int getNumber() {
		return now;
	}

	public void execute() {
		for (int i = min; i < max; i = i + plus) {
			now = i;
			notifiyObservers();
		}
	}
}
