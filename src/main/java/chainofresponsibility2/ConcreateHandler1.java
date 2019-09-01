package chainofresponsibility2;

public class ConcreateHandler1 extends Handler {
    protected boolean resolve() {
        System.out.println("Concreate1");
        return false;
    }
}
