package visitor;

/**
 * Element(요소)의 역할
 */
public interface Element {
	// 방문자가 방문하는 곳
	void accept(Visitor v);
}
