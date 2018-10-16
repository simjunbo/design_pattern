package visitor;

import java.util.Iterator;

/**
 * ConcreteVisitor(구체적인 방문자)의 역할
 */
public class ListVisitor extends Visitor {
	private String currentdir = "";

	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator it = directory.iterator();

		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}
}
