package chainofresponsibility2;

public class Main {
    public static void main(String[] args) {
        Handler handler = new ConcreateHandler1();
        Handler handler2 = new ConcreateHandler2();
        Handler handler3 = new ConcreateHandler3();

        handler.setNext(handler2).setNext(handler3);
        handler.support();
    }
}
