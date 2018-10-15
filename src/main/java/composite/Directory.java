package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Composite(복합체)의 역할 - Leaf이나 Composite를 넣을 수 있다.
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
		entry.parent = this;
		return this;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
