package bridge.function;

import bridge.implement.DisplayImpl;

/**
 * Abstraction(추상화)의 역할
 * 기능 클래스
 */
public class Display {
	private DisplayImpl impl;

	/**
	 * Brdige
	 */
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}
