package command.drawer;

import command.command.MacroCommand;

import java.awt.*;

/**
 * Receiver(수신자)의 역할
 */
public class DrawCanvas extends Canvas implements Drawable {
	private Color color = Color.red;
	private int raduis = 6;

	private MacroCommand history;

	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}

	public void paint(Graphics g) {
		history.execute();
	}

	// Action()
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - raduis, y - raduis, raduis * 2, raduis * 2);
	}
}
