package iterator.A1;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteAggregate(구체적인 집합체)
 * Aggregate 역할이 결정한 인터페이스를 실제로 구현하는 일
 */
public class BookShelf implements Aggregate {
	private List books;

	public BookShelf(int maxsize) {
		this.books = new ArrayList(maxsize);
	}

	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}

	public void appendBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	public Iterator iterator() {
		return new BookShelfIfIterator(this);
	}
}
