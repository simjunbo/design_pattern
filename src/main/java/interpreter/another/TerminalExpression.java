package interpreter.another;

/**
 * TerminalExpression (문법의 종착역)
 */
public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
