package abstractfactory.factory;

/**
 * AbstractProduct(추상적인 제품)
 * 하이퍼링크 (부품)
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
