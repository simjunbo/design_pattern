package abstractfactory.factory;

import java.util.ArrayList;

/**
 * AbstractProduct(추상적인 제품)
 * 목록 (부품)
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
