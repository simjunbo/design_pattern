package command.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * ConcreteCommand(구체적인 명령)의 역할
 */
public class MacroCommand implements Command {
	private Stack commands = new Stack(); // 집합

	public void execute() {
		Iterator it = commands.iterator();
		if (it.hasNext()) {
			((Command) it.next()).execute();
		}
	}

	// 추가
	public void append(Command cmd) {
		if (cmd != this) {
			commands.push(cmd);
		}
	}

	// 마지막 명령 삭제
	public void undo() {
		if (!commands.empty()) {
			commands.pop();
		}
	}

	// 전부 삭제
	public void clear() {
		commands.clear();
	}
}
