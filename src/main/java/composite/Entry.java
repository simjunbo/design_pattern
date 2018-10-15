package composite;

/**
 * Component - Leaf과 Composite 역할을 동일 시 하는 역할
 */
public abstract class Entry {
	protected Entry parent;

	public abstract String getName();

	public abstract int getSize();

	// 재귀
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	public String toString() {
		return getName() + " (" + getSize() + ")";
	}

	public String getFullName() {
		StringBuffer sb = new StringBuffer();
		Entry entry = this;
		do {
			sb.insert(0, "/" + entry.getName());
			entry = entry.parent;
		} while (entry != null);
		return sb.toString();
	}
}
