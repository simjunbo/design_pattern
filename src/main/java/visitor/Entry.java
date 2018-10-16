package visitor;

import java.util.Iterator;

public abstract class Entry implements Element { // visitor 패턴을 적용시키기 위해서 Element를 구현하고 있다.
	public abstract String getName();

	public abstract int getSize();

	// 재귀
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public Iterator iterator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	// 템플릿 메소드
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
