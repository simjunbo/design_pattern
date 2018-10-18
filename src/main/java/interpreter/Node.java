package interpreter;

/**
 * AbstractExpression(추삭적인 표현)의 역할
 */
public abstract class Node {
	public abstract void parse(Context context) throws ParseException;
}
