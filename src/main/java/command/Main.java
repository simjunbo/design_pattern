package command;

import command.command.Command;
import command.command.MacroCommand;
import command.drawer.DrawCanvas;
import command.drawer.DrawCommand;

import java.awt.event.*;
import javax.swing.*;

/**
 * Client(의뢰자)의 역할
 * Invoker(기동자)의 역할
 */
public class Main extends JFrame implements ActionListener, WindowListener {
	// 그림 그린 이력
	private MacroCommand history = new MacroCommand();
	// 그림 그리는 영역
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	// 제거 버튼
	private JButton clearButton = new JButton("clear");

	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}

	// 생성자
	public Main(String title) {
		super(title);

		this.addWindowListener(this);

		// Invoker (기동)
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Command cmd = new DrawCommand(canvas, e.getPoint());
				history.append(cmd);
				cmd.execute();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}

		});
		clearButton.addActionListener(this);

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		show();
	}

	// ActionListener용
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
		}
	}

	// WindowListener용
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}
}
