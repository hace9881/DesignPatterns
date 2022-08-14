package ObserverDesignPattern;

public interface Subject {
    public void notifyObservers();
    public void registerObserver(Observer o);
    public void removeObservers(Observer o);
}
