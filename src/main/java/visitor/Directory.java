package visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ConcreteElement(구체적 요소)의 역할
 * ObjectStructure(오브젝트의 구조)의 역할
 * 1인 2역
 */
public class Directory extends Entry {
	private String name;
	private ArrayList directory = new ArrayList();

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		int size = 0;
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	@Override
	public Iterator iterator() {
		return directory.iterator();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}
