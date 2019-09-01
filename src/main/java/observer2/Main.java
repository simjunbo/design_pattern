package observer2;

public class Main {
    public static void main(String[] args) {
        Observer log = new LogObserver();
        Observer sout = new SystemOutObserver();

        Subject minus = new MinusSubject(10);
        minus.add(log);
        minus.add(sout);
        minus.execute();

        Subject plus = new PlusSubject(10);
        plus.add(log);
        plus.add(sout);
        plus.execute();
    }
}
