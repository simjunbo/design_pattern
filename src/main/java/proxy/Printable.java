package proxy;

/**
 * Subject(주제)의 역할
 */
public interface Printable {
	// 이름의 설정
	void setPrinterName(String name);

	// 이름의 취득
	String getPrinterName();

	// 문자열 표시
	void print(String string);
}
