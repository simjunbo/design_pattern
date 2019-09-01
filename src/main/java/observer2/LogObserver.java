package observer2;

/**
 * Concreate Observer
 */
public class LogObserver implements Observer {
    public void update(Subject subject) {
        System.out.println("Log : " + subject.getNumber());
    }
}
