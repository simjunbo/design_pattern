package visitor;

/**
 * Visitor(방문자)의 역할
 */
public abstract class Visitor {
	public abstract void visit(File file);

	public abstract void visit(Directory directory);
}
