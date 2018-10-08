package iterator.A1;

/**
 * BookShelf 클래스에서는 최초에 지정한 서가의 크기를 초가해서 책을 넣을 수 없다.
 * 그래서 배열이 아닌 ArrayList를 사용해서 서가의 크기를 초과해도 책을 추가할 수 있도록 만들어라.
 */
public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("Test Books"));

		/**
		 * Array에서 Vector로 변경한다고 해도 변경없이 정상적으로 동작한다.
		 */
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
