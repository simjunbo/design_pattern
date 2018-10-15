package abstractfactory.factory;

/**
 *
 * Link과 Tray 상위 클래스
 */
public abstract class Item {
    protected String caption;

    public abstract String makeHtml();

    public Item(String caption) {
        this.caption = caption;
    }
}
