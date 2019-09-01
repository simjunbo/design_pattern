package observer2;

/**
 * ConcreteSubject
 */
public class PlusSubject extends Subject {

    int num = 0;

    public PlusSubject(int num) {
        this.num = num;
    }

    public void action() {
        num += 1;
    }

    public int getNumber() {
        return num;
    }
}
