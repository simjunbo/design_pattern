package visitor;

/**
 * ConcreteElement(구체적 요소)의 역할
 */
public class File extends Entry {
	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}
