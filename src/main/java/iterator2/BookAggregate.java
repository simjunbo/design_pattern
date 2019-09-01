package iterator2;

import java.util.ArrayList;
import java.util.List;

public class BookAggregate implements Aggregate {
    private List<Book> list = new ArrayList<Book>();
    private int index = 0;

    public void add(Book book) {
        list.add(book);
    }

    public String iterator() {
        if (list.size() > index) {
            Book book = list.get(index);
            index++;
            if (book != null) {
                return book.getName();
            }
        }
        return null;
    }

    public int getSize() {
        return list.size();
    }
}
