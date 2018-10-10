package factorymethod.television;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreateCreator(구체적인 작성자)
 */
public class TelevisionFactory extends Factory {
	private List owners = new ArrayList();

	protected Product createProduct(String owner) {
		return new Television(owner);
	}

	protected void registerProduct(Product product) {
		owners.add(((Television) product).getOwner());
	}

	public List getOwners() {
		return owners;
	}
}
