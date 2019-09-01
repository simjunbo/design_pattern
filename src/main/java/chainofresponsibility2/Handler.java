package chainofresponsibility2;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler handler) {
        this.next = handler;
        return handler;
    }

    public final void support() {
        if (resolve()) {
            System.out.println("완료");
        } else if (next != null) {
            next.support();
        } else {
            System.out.println("조건 맞는게 없음");
        }
    }

    protected abstract boolean resolve();
}
