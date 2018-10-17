package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Subject(관찰 대상자)의 역할
 */
public abstract class NumberGenerator {
	// Observer 저장
	private ArrayList observers = new ArrayList();

	// Observer 추가
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifiyObservers() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer) it.next();
			o.update(this);
		}
	}

	public abstract int getNumber();

	public abstract void execute();
}
