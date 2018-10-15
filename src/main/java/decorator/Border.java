package decorator;

/**
 * Decorator(장식자)의 역할
 */
public abstract class Border extends Display {
	protected Display display;

	protected Border(Display display) {
		this.display = display;
	}
}
