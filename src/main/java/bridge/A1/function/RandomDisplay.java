package bridge.A1.function;

import bridge.A1.implement.DisplayImpl;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
	private Random random = new Random();

	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void randomDisplay(int times) {
		multiDisplay(random.nextInt(times));
	}
}