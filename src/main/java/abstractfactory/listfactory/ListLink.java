package abstractfactory.listfactory;

import abstractfactory.factory.Link;

/**
 * ConcreteProduct(구체적인 제품)
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHtml() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
