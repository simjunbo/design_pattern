package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreateCreator(구체적인 작성자)
 */
public class IDCardFactory extends Factory {
	private List owners = new ArrayList();

	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	protected void registerProduct(Product product) {
		owners.add(((IDCard) product).getOwner());
	}

	public List getOwners() {
		return owners;
	}
}
