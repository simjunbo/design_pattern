package iterator2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("book1");
        Book book2 = new Book("book2");

        Aggregate aggregate = new BookAggregate();
        ((BookAggregate) aggregate).add(book);
        ((BookAggregate) aggregate).add(book2);

        Iterator iterator = new BookIterator(aggregate);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
