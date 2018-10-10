package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;
import factorymethod.television.TelevisionFactory;

/**
 * framework 패키지 안에서 idcard 패키지를 import 하지 않고 있다.
 * Product 클래스나 Factory 클래스 안에서는 IDCard나 IDCardFactory 라는 구체적인 클래스 이름이 없다.
 * 따라서 새로운 클래스를 동일한 framework에서 생성할 경우에도 framework 패키지의 내용을 수정할 필요가 없다.
 */
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");

		card1.use();
		card2.use();
		card3.use();

		Factory factory2 = new TelevisionFactory();
		Product tv1 = factory2.create("LG");
		Product tv2 = factory2.create("SAMSUNG");
		Product tv3 = factory2.create("SONY");

		tv1.use();
		tv2.use();
		tv3.use();
	}
}
