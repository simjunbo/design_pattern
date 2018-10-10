package adapter.classadapter;

/**
 * Adapter (상속)
 */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	public void printWeak() {
		showWithParen();
	}

	public void printStrong() {
		showWithAster();
	}
}
