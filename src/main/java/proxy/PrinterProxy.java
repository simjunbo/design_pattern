package proxy;

/**
 * Proxy(대리인)의 역할
 */
public class PrinterProxy implements Printable {
	private String name;
	private Printer real; // 위임

	public PrinterProxy() {

	}

	public PrinterProxy(String name) {
		this.name = name;
	}

	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	public String getPrinterName() {
		return name;
	}

	// proxy에서 처리할 수 없는건 위임한다.
	public void print(String string) {
		realize();
		real.print(string);
	}

	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}
