package proxy;

/**
 * RealSubject(실제의 주체)의 역할
 * HeavyJob
 */
public class Printer implements Printable {

	private String name;

	public Printer(String name) {
		this.name = name;
		heavyJob("Printer의 인스턴스 (" + name + ")을 생성 중");
	}

	public void setPrinterName(String name) {
		this.name = name;
	}

	public String getPrinterName() {
		return name;
	}

	public void print(String string) {
		System.out.println("===" + name + "===");
		System.out.println(string);
	}

	private void heavyJob(String msg) {
		System.out.print(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.print(".");
		}
		System.out.println("완료.");
	}
}
