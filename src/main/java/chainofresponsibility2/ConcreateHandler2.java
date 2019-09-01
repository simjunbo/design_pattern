package chainofresponsibility2;

public class ConcreateHandler2 extends Handler {

    protected boolean resolve() {
        System.out.println("Concreate2");
        return false;
    }
}
