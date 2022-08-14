package ObserverDesignPattern;

public class ObserverPatternSimulation {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new SimpleObserver(concreteSubject);
        Observer observer2 = new SimpleObserver(concreteSubject);
        concreteSubject.setValue(1);
    }
}
