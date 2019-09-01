package observer2;

/**
 * Concreate Observer
 */
public class SystemOutObserver implements Observer {
    public void update(Subject subject) {
        System.out.println("Sout : " + subject.getNumber());
    }
}
