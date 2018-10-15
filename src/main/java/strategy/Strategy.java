package strategy;

/**
 * Strategy (전략)의 역할
 * 예제가 조금 난해한것 같다...
 */
public interface Strategy {
	Hand nextHand();

	void study(boolean win);
}
