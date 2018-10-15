package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * factory pacakge만 참고되어 있다.
 * Clinet(의뢰자)
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java Main class.name.of.ConcreteFacotry");
            System.out.println("Example 1 : java Main listFactory.ListFactory");
            System.out.println("Example 1 : java Main tfactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "http://joins.com");
        Link chosun = factory.createLink("조선일보", "http://chosun.com");

        Link us_yahoo = factory.createLink("Yahoo", "http://yahoo.com");
        Link kr_yahoo = factory.createLink("Yahoo_Korea", "http://yahoo.co.kr");
        Link excite = factory.createLink("Excite", "http://excite.com");
        Link google = factory.createLink("Google", "http://google.com");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);

        Tray trayyahoo = factory.createTray("Yahoo");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(kr_yahoo);

        Tray traysearch = factory.createTray("검색엔진");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
