package memento2;

/**
 * 참조) https://objectbuilder.tistory.com/89
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State : " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First save State : " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second save State:" + originator.getState());
    }
}
