package mediator.colleague;

import mediator.mediator.Mediator;

import java.awt.*;

/**
 * ConcreteColleague(구체적인 동료)의 역할
 */
public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}
}
