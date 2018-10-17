package memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento(기억)의 역할
 * 같은 패키지에서만 접근하기 위해 default 접근 제한자를 사용했다.
 */
public class Memento {
	int money;
	ArrayList fruits;

	// narrow interface
	public int getMoney() {
		return money;
	}

	// wide interface
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}

	// wide interface
	void addFruit(String fruit) {
		fruits.add(fruit);
	}

	// wide interface
	List getFruits() {
		return (List) fruits.clone();
	}
}
