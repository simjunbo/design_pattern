package command.drawer;

import command.command.Command;

import java.awt.*;

/**
 * ConcreteCommand(구체적인 명령)의 역할
 */
public class DrawCommand implements Command {
	protected Drawable drawable;
	private Point position;

	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}

	public void execute() {
		// receiver
		drawable.draw(position.x, position.y);
	}
}
