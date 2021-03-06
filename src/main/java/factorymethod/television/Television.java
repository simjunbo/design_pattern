package factorymethod.television;

import factorymethod.framework.Product;

/**
 * ConcreteProduct(구체적인 제품)
 */
public class Television extends Product {
	private String owner;

	Television(String owner) {
		System.out.println(owner + "의 TV를 만듭니다.");
		this.owner = owner;
	}

	public void use() {
		System.out.println(owner + "의 TV를 사용합니다.");
	}

	public String getOwner() {
		return owner;
	}
}
