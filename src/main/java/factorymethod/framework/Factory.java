package factorymethod.framework;

/**
 * Creator(작성자)
 * Creator 역할이 가지고 있는 정보는 Product 역할과 인스턴스 생성의 메소드를 호출하면 Product가 생성된다는 것이다.
 */
public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);
}
