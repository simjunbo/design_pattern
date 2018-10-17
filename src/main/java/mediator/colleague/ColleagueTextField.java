package mediator.colleague;

import mediator.mediator.Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * ConcreteColleague(구체적인 동료)의 역할
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) {
		super(text, columns);
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();
	}
}
