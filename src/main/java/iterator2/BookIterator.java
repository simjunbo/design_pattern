package iterator2;

public class BookIterator implements Iterator {

    private Aggregate aggregate;
    private int index;

    public BookIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        index = 0;
    }

    public boolean hasNext() {
        if (index < aggregate.getSize()) {
            return true;
        }
        return false;
    }

    public String next() {
        index++;
        return aggregate.iterator();
    }
}
