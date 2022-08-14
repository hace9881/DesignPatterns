package ObserverDesignPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    private ArrayList<Observer> observerArrayList;
    private int value=0;

    public ConcreteSubject() {
        this.observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observerArrayList)
        {
            observer.update(value);
        }

    }
    public void setValue(int value) {
        this.value = value;
        this.notifyObservers();
    }
}
