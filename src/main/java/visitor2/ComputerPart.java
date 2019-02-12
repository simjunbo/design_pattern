package visitor2;

/**
 * Element (구조)
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}

/**
 * ConcreteElement
 */
class Keyboard implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}

/**
 * ConcreteElement
 */
class Monitor implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}

/**
 * ConcreteElement
 */
class Mouse implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}

/**
 * ConcreteElement
 */
class Computer implements ComputerPart {

	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}
