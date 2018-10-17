package observer;

/**
 * ConcreateObserver(구체적인 관리자)의 역할
 * 관찰한 수를 숫자로 표시
 */
public class DigitObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}
}
