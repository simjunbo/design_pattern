package chainofresponsibility2;

public class ConcreateHandler3 extends Handler {
    protected boolean resolve() {
        System.out.println("Concreate3");
        return true;
    }
}
