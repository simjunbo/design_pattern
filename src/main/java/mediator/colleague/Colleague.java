package mediator.colleague;

import mediator.mediator.Mediator;

/**
 * Colleague(동료)의 역할
 */
public interface Colleague {
	void setMediator(Mediator mediator);

	void setColleagueEnabled(boolean enabled);
}
