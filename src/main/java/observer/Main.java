package observer;

import observer.A1.IncrementalNumberGenerator;

public class Main {
	public static void main(String[] args) {
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();

		// A1
		NumberGenerator a1 = new IncrementalNumberGenerator(10, 50, 5);
		a1.addObserver(observer1);
		a1.addObserver(observer2);
		a1.execute();
	}
}
