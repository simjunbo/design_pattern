package memento;

import memento.game.Gamer;
import memento.game.Memento;

/**
 * Caretaker(관리인)의 역할
 */
public class Main {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memenot = gamer.createMemento(); // 최초의 snapshot
		for (int i = 0; i < 100; i++) {
			System.out.println("=== " + i); // 개수 표시

			gamer.bet();

			System.out.println("소지급은" + gamer.getMoney() + "원이 되었습니다.");

			// Memento 결정
			if (gamer.getMoney() > memenot.getMoney()) {
				System.out.println("소지금이 증가했습니다.");
				memenot = gamer.createMemento();
			} else if (gamer.getMoney() < memenot.getMoney() / 2) {
				System.out.println("감소했으므로 이전의 상태로 복원하자");
				gamer.restoreMemento(memenot);
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println("");
		}
	}
}
