package prototype.framework;

/**
 * Prototype(원형)
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
