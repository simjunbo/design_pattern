package adapter.classadapter;

/**
 * Client(의뢰자)
 * Banner 클래스나 showWithParen 메소드, showWithAster 메소드는 Main 클래스의 소스 코드 상에서는 완전히 감추어졌다.
 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
