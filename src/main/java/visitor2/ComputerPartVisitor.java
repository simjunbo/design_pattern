package visitor2;

/**
 * visitor (처리)
 */
public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}

/**
 * ConcreteVisitor
 * ConcreteElement가 추가되면 ConcreteVisitor에 새로운 visit 메소드를 구현해 줘야 한다.
 */
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}
}

