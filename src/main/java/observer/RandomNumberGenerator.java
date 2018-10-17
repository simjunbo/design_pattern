package observer;

import java.util.Random;

/**
 * ConcreateSubject(구체적인 관찰 대상자)의 역할
 */
public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;

	public int getNumber() {
		return number;
	}

	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifiyObservers();
		}
	}
}
