package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public final void execute() {
        action();
        notifyObserver();
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract void action();

    public abstract int getNumber();
}
