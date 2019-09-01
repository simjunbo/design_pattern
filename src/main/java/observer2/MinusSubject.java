package observer2;

/**
 * ConcreteSubject
 */
public class MinusSubject extends Subject {
    int num = 0;

    public MinusSubject(int num) {
        this.num = num;
    }

    public void action() {
        num -= 1;
    }

    public int getNumber() {
        return num;
    }
}
